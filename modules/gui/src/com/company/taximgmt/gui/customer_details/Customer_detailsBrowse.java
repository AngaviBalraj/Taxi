package com.company.taximgmt.gui.customer_details;

import com.company.taximgmt.entity.Customer_details;
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
public class Customer_detailsBrowse extends AbstractLookup {

    /**
     * The {@link CollectionDatasource} instance that loads a list of {@link Customer_details} records
     * to be displayed in {@link Customer_detailsBrowse#customer_detailsesTable} on the left
     */
    @Inject
    private CollectionDatasource<Customer_details, UUID> customer_detailsesDs;

    /**
     * The {@link Datasource} instance that contains an instance of the selected entity
     * in {@link Customer_detailsBrowse#customer_detailsesDs}
     * <p/> Containing instance is loaded in {@link CollectionDatasource#addItemChangeListener}
     * with the view, specified in the XML screen descriptor.
     * The listener is set in the {@link Customer_detailsBrowse#init(Map)} method
     */
    @Inject
    private Datasource<Customer_details> customer_detailsDs;

    /**
     * The {@link Table} instance, containing a list of {@link Customer_details} records,
     * loaded via {@link Customer_detailsBrowse#customer_detailsesDs}
     */
    @Inject
    private Table<Customer_details> customer_detailsesTable;

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
     * The {@link FieldGroup} instance that is linked to {@link Customer_detailsBrowse#customer_detailsDs}
     * and shows fields of the selected {@link Customer_details} record
     */
    @Inject
    private FieldGroup fieldGroup;
    
    /**
     * The {@link RemoveAction} instance, related to {@link Customer_detailsBrowse#customer_detailsesTable}
     */
    @Named("customer_detailsesTable.remove")
    private RemoveAction customer_detailsesTableRemove;
    
    @Inject
    private DataSupplier dataSupplier;

    /**
     * {@link Boolean} value, indicating if a new instance of {@link Customer_details} is being created
     */
    private boolean creating;

    @Override
    public void init(Map<String, Object> params) {

        /**
         * Adding {@link com.haulmont.cuba.gui.data.Datasource.ItemChangeListener} to {@link customer_detailsesDs}
         * The listener reloads the selected record with the specified view and sets it to {@link customer_detailsDs}
         */
        customer_detailsesDs.addItemChangeListener(e -> {
            if (e.getItem() != null) {
                Customer_details reloadedItem = dataSupplier.reload(e.getDs().getItem(), customer_detailsDs.getView());
                customer_detailsDs.setItem(reloadedItem);
            }
        });
        
        /**
         * Adding {@link CreateAction} to {@link customer_detailsesTable}
         * The listener removes selection in {@link customer_detailsesTable}, sets a newly created item to {@link customer_detailsDs}
         * and enables controls for record editing
         */
        customer_detailsesTable.addAction(new CreateAction(customer_detailsesTable) {
            @Override
            protected void internalOpenEditor(CollectionDatasource datasource, Entity newItem, Datasource parentDs, Map<String, Object> params) {
                customer_detailsesTable.setSelected(Collections.emptyList());
                customer_detailsDs.setItem((Customer_details) newItem);
                enableEditControls(true);
            }
        });

        /**
         * Adding {@link EditAction} to {@link customer_detailsesTable}
         * The listener enables controls for record editing
         */
        customer_detailsesTable.addAction(new EditAction(customer_detailsesTable) {
            @Override
            protected void internalOpenEditor(CollectionDatasource datasource, Entity existingItem, Datasource parentDs, Map<String, Object> params) {
                if (customer_detailsesTable.getSelected().size() == 1) {
                    enableEditControls(false);
                }
            }
        });
        
        /**
         * Setting {@link RemoveAction#afterRemoveHandler} for {@link customer_detailsesTableRemove}
         * to reset record, contained in {@link customer_detailsDs}
         */
        customer_detailsesTableRemove.setAfterRemoveHandler(removedItems -> customer_detailsDs.setItem(null));
        
        disableEditControls();
    }

    /**
     * Method that is invoked by clicking Save button after editing an existing or creating a new record
     */
    public void save() {
        getDsContext().commit();

        Customer_details editedItem = customer_detailsDs.getItem();
        if (creating) {
            customer_detailsesDs.includeItem(editedItem);
        } else {
            customer_detailsesDs.updateItem(editedItem);
        }
        customer_detailsesTable.setSelected(editedItem);

        disableEditControls();
    }

    /**
     * Method that is invoked by clicking Save button after editing an existing or creating a new record
     */
    public void cancel() {
        Customer_details selectedItem = customer_detailsesDs.getItem();
        if (selectedItem != null) {
            Customer_details reloadedItem = dataSupplier.reload(selectedItem, customer_detailsDs.getView());
            customer_detailsesDs.setItem(reloadedItem);
        } else {
            customer_detailsDs.setItem(null);
        }

        disableEditControls();
    }

    /**
     * Enabling controls for record editing
     * @param creating indicates if a new instance of {@link Customer_details} is being created
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
        customer_detailsesTable.requestFocus();
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