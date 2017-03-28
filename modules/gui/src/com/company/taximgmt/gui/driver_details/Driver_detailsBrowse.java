package com.company.taximgmt.gui.driver_details;

import com.company.taximgmt.entity.Driver_details;
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

public class Driver_detailsBrowse extends AbstractLookup {

    /**
     * The {@link CollectionDatasource} instance that loads a list of {@link Driver_details} records
     * to be displayed in {@link Driver_detailsBrowse#driver_detailsesTable} on the left
     */
    @Inject
    private CollectionDatasource<Driver_details, UUID> driver_detailsesDs;

    /**
     * The {@link Datasource} instance that contains an instance of the selected entity
     * in {@link Driver_detailsBrowse#driver_detailsesDs}
     * <p/> Containing instance is loaded in {@link CollectionDatasource#addItemChangeListener}
     * with the view, specified in the XML screen descriptor.
     * The listener is set in the {@link Driver_detailsBrowse#init(Map)} method
     */
    @Inject
    private Datasource<Driver_details> driver_detailsDs;

    /**
     * The {@link Table} instance, containing a list of {@link Driver_details} records,
     * loaded via {@link Driver_detailsBrowse#driver_detailsesDs}
     */
    @Inject
    private Table<Driver_details> driver_detailsesTable;

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
     * The {@link FieldGroup} instance that is linked to {@link Driver_detailsBrowse#driver_detailsDs}
     * and shows fields of the selected {@link Driver_details} record
     */
    @Inject
    private FieldGroup fieldGroup;
    
    /**
     * The {@link RemoveAction} instance, related to {@link Driver_detailsBrowse#driver_detailsesTable}
     */
    @Named("driver_detailsesTable.remove")
    private RemoveAction driver_detailsesTableRemove;
    
    @Inject
    private DataSupplier dataSupplier;

    /**
     * {@link Boolean} value, indicating if a new instance of {@link Driver_details} is being created
     */
    private boolean creating;

    @Override
    public void init(Map<String, Object> params) {

        /**
         * Adding {@link com.haulmont.cuba.gui.data.Datasource.ItemChangeListener} to {@link driver_detailsesDs}
         * The listener reloads the selected record with the specified view and sets it to {@link driver_detailsDs}
         */
        driver_detailsesDs.addItemChangeListener(e -> {
            if (e.getItem() != null) {
                Driver_details reloadedItem = dataSupplier.reload(e.getDs().getItem(), driver_detailsDs.getView());
                driver_detailsDs.setItem(reloadedItem);
            }
        });
        
        /**
         * Adding {@link CreateAction} to {@link driver_detailsesTable}
         * The listener removes selection in {@link driver_detailsesTable}, sets a newly created item to {@link driver_detailsDs}
         * and enables controls for record editing
         */
        driver_detailsesTable.addAction(new CreateAction(driver_detailsesTable) {
            @Override
            protected void internalOpenEditor(CollectionDatasource datasource, Entity newItem, Datasource parentDs, Map<String, Object> params) {
                driver_detailsesTable.setSelected(Collections.emptyList());
                driver_detailsDs.setItem((Driver_details) newItem);
                enableEditControls(true);
            }
        });

        /**
         * Adding {@link EditAction} to {@link driver_detailsesTable}
         * The listener enables controls for record editing
         */
        driver_detailsesTable.addAction(new EditAction(driver_detailsesTable) {
            @Override
            protected void internalOpenEditor(CollectionDatasource datasource, Entity existingItem, Datasource parentDs, Map<String, Object> params) {
                if (driver_detailsesTable.getSelected().size() == 1) {
                    enableEditControls(false);
                }
            }
        });
        
        /**
         * Setting {@link RemoveAction#afterRemoveHandler} for {@link driver_detailsesTableRemove}
         * to reset record, contained in {@link driver_detailsDs}
         */
        driver_detailsesTableRemove.setAfterRemoveHandler(removedItems -> driver_detailsDs.setItem(null));
        
        disableEditControls();
    }

    /**
     * Method that is invoked by clicking Save button after editing an existing or creating a new record
     */
    public void save() {
        getDsContext().commit();

        Driver_details editedItem = driver_detailsDs.getItem();
        if (creating) {
            driver_detailsesDs.includeItem(editedItem);
        } else {
            driver_detailsesDs.updateItem(editedItem);
        }
        driver_detailsesTable.setSelected(editedItem);

        disableEditControls();
    }

    /**
     * Method that is invoked by clicking Save button after editing an existing or creating a new record
     */
    public void cancel() {
        Driver_details selectedItem = driver_detailsesDs.getItem();
        if (selectedItem != null) {
            Driver_details reloadedItem = dataSupplier.reload(selectedItem, driver_detailsDs.getView());
            driver_detailsesDs.setItem(reloadedItem);
        } else {
            driver_detailsDs.setItem(null);
        }

        disableEditControls();
    }

    /**
     * Enabling controls for record editing
     * @param creating indicates if a new instance of {@link Driver_details} is being created
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
        driver_detailsesTable.requestFocus();
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