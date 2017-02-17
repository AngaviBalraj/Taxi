package com.company.taximgmt.gui.regular_report;

import com.company.taximgmt.entity.Regular_report;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.actions.EditAction;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.DataSupplier;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;
import java.util.Map;
import java.util.UUID;

public class Regular_reportBrowse extends AbstractLookup {

    /**
     * The {@link CollectionDatasource} instance that loads a list of {@link Regular_report} records
     * to be displayed in {@link Regular_reportBrowse#regular_reportsTable} on the left
     */
    @Inject
    private CollectionDatasource<Regular_report, UUID> regular_reportsDs;

    /**
     * The {@link Datasource} instance that contains an instance of the selected entity
     * in {@link Regular_reportBrowse#regular_reportsDs}
     * <p/> Containing instance is loaded in {@link CollectionDatasource#addItemChangeListener}
     * with the view, specified in the XML screen descriptor.
     * The listener is set in the {@link Regular_reportBrowse#init(Map)} method
     */
    @Inject
    private Datasource<Regular_report> regular_reportDs;

    /**
     * The {@link Table} instance, containing a list of {@link Regular_report} records,
     * loaded via {@link Regular_reportBrowse#regular_reportsDs}
     */
    @Inject
    private Table<Regular_report> regular_reportsTable;

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
     * The {@link FieldGroup} instance that is linked to {@link Regular_reportBrowse#regular_reportDs}
     * and shows fields of the selected {@link Regular_report} record
     */
    @Inject
    private FieldGroup fieldGroup;
    
    @Inject
    private DataSupplier dataSupplier;

    /**
     * {@link Boolean} value, indicating if a new instance of {@link Regular_report} is being created
     */
    private boolean creating;

    @Override
    public void init(Map<String, Object> params) {

        /**
         * Adding {@link com.haulmont.cuba.gui.data.Datasource.ItemChangeListener} to {@link regular_reportsDs}
         * The listener reloads the selected record with the specified view and sets it to {@link regular_reportDs}
         */
        regular_reportsDs.addItemChangeListener(e -> {
            if (e.getItem() != null) {
                Regular_report reloadedItem = dataSupplier.reload(e.getDs().getItem(), regular_reportDs.getView());
                regular_reportDs.setItem(reloadedItem);
            }
        });
        

        /**
         * Adding {@link EditAction} to {@link regular_reportsTable}
         * The listener enables controls for record editing
         */
        regular_reportsTable.addAction(new EditAction(regular_reportsTable) {
            @Override
            protected void internalOpenEditor(CollectionDatasource datasource, Entity existingItem, Datasource parentDs, Map<String, Object> params) {
                if (regular_reportsTable.getSelected().size() == 1) {
                    enableEditControls(false);
                }
            }
        });
        
        disableEditControls();
    }

    /**
     * Method that is invoked by clicking Save button after editing an existing or creating a new record
     */
    public void save() {
        getDsContext().commit();

        Regular_report editedItem = regular_reportDs.getItem();
        if (creating) {
            regular_reportsDs.includeItem(editedItem);
        } else {
            regular_reportsDs.updateItem(editedItem);
        }
        regular_reportsTable.setSelected(editedItem);

        disableEditControls();
    }

    /**
     * Method that is invoked by clicking Save button after editing an existing or creating a new record
     */
    public void cancel() {
        Regular_report selectedItem = regular_reportsDs.getItem();
        if (selectedItem != null) {
            Regular_report reloadedItem = dataSupplier.reload(selectedItem, regular_reportDs.getView());
            regular_reportsDs.setItem(reloadedItem);
        } else {
            regular_reportDs.setItem(null);
        }

        disableEditControls();
    }

    /**
     * Enabling controls for record editing
     * @param creating indicates if a new instance of {@link Regular_report} is being created
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
        regular_reportsTable.requestFocus();
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