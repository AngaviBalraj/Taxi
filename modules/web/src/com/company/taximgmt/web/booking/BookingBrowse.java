package com.company.taximgmt.web.booking;

import com.company.taximgmt.entity.Booking;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.actions.CreateAction;
import com.haulmont.cuba.gui.components.actions.EditAction;
import com.haulmont.cuba.gui.components.actions.RemoveAction;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.DataSupplier;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

public class BookingBrowse extends AbstractLookup {

    /**
     * The {@link CollectionDatasource} instance that loads a list of {@link Booking} records
     * to be displayed in {@link BookingBrowse#bookingsTable} on the left
     */
    @Inject
    private CollectionDatasource<Booking, UUID> bookingsDs;

    /**
     * The {@link Datasource} instance that contains an instance of the selected entity
     * in {@link BookingBrowse#bookingsDs}
     * <p/> Containing instance is loaded in {@link CollectionDatasource#addItemChangeListener}
     * with the view, specified in the XML screen descriptor.
     * The listener is set in the {@link BookingBrowse#init(Map)} method
     */
    @Inject
    private Datasource<Booking> bookingDs;

    /**
     * The {@link Table} instance, containing a list of {@link Booking} records,
     * loaded via {@link BookingBrowse#bookingsDs}
     */
    @Inject
    private Table<Booking> bookingsTable;

    /**
     * The {@link BoxLayout} instance that contains components on the left side
     * of {@link SplitPanel}
     */
    @Inject
    private BoxLayout lookupBox;

    /**
     * The {@link BoxLayout} instance that contains buttons to invoke Save or Cancel actions in edit mode
     */
    @Inject
    private BoxLayout actionsPane;

    /**
     * The {@link FieldGroup} instance that is linked to {@link BookingBrowse#bookingDs}
     * and shows fields of the selected {@link Booking} record
     */
    @Inject
    private FieldGroup fieldGroup;
    
    /**
     * The {@link RemoveAction} instance, related to {@link BookingBrowse#bookingsTable}
     */
    @Named("bookingsTable.remove")
    private RemoveAction bookingsTableRemove;
    
    @Inject
    private DataSupplier dataSupplier;

    /**
     * {@link Boolean} value, indicating if a new instance of {@link Booking} is being created
     */
    private boolean creating;

    @Override
    public void init(Map<String, Object> params) {

        /**
         * Adding {@link com.haulmont.cuba.gui.data.Datasource.ItemChangeListener} to {@link bookingsDs}
         * The listener reloads the selected record with the specified view and sets it to {@link bookingDs}
         */
        bookingsDs.addItemChangeListener(e -> {
            if (e.getItem() != null) {
                Booking reloadedItem = dataSupplier.reload(e.getDs().getItem(), bookingDs.getView());
                bookingDs.setItem(reloadedItem);
            }
        });
        
        /**
         * Adding {@link CreateAction} to {@link bookingsTable}
         * The listener removes selection in {@link bookingsTable}, sets a newly created item to {@link bookingDs}
         * and enables controls for record editing
         */
        bookingsTable.addAction(new CreateAction(bookingsTable) {
            @Override
            protected void internalOpenEditor(CollectionDatasource datasource, Entity newItem, Datasource parentDs, Map<String, Object> params) {
                bookingsTable.setSelected(Collections.emptyList());
                bookingDs.setItem((Booking) newItem);
                enableEditControls(true);
            }
        });

        /**
         * Adding {@link EditAction} to {@link bookingsTable}
         * The listener enables controls for record editing
         */
        bookingsTable.addAction(new EditAction(bookingsTable) {
            @Override
            protected void internalOpenEditor(CollectionDatasource datasource, Entity existingItem, Datasource parentDs, Map<String, Object> params) {
                if (bookingsTable.getSelected().size() == 1) {
                    enableEditControls(false);
                }
            }
        });
        
        /**
         * Setting {@link RemoveAction#afterRemoveHandler} for {@link bookingsTableRemove}
         * to reset record, contained in {@link bookingDs}
         */
        bookingsTableRemove.setAfterRemoveHandler(removedItems -> bookingDs.setItem(null));
        
        disableEditControls();
    }

    /**
     * Method that is invoked by clicking Save button after editing an existing or creating a new record
     */
    public void save() {
        getDsContext().commit();

        Booking editedItem = bookingDs.getItem();
        if (creating) {
            bookingsDs.includeItem(editedItem);
        } else {
            bookingsDs.updateItem(editedItem);
        }
        bookingsTable.setSelected(editedItem);

        disableEditControls();
    }

    /**
     * Method that is invoked by clicking Save button after editing an existing or creating a new record
     */
    public void cancel() {
        Booking selectedItem = bookingsDs.getItem();
        if (selectedItem != null) {
            Booking reloadedItem = dataSupplier.reload(selectedItem, bookingDs.getView());
            bookingsDs.setItem(reloadedItem);
        } else {
            bookingDs.setItem(null);
        }

        disableEditControls();
    }

    /**
     * Enabling controls for record editing
     * @param creating indicates if a new instance of {@link Booking} is being created
     */
    private void enableEditControls(boolean creating) {
        this.creating = creating;
        initEditComponents(true);
        fieldGroup.requestFocus();
    }

    /**
     * Disabling editing controls
     */
    private void disableEditControls() {
        initEditComponents(false);
        bookingsTable.requestFocus();
    }

    /**
     * Initiating edit controls, depending on if they should be enabled/disabled
     * @param enabled if true - enables editing controls and disables controls on the left side of the splitter
     *                if false - visa versa
     */
    private void initEditComponents(boolean enabled) {
        fieldGroup.setEditable(enabled);
        actionsPane.setVisible(enabled);
        lookupBox.setEnabled(!enabled);
    }
}