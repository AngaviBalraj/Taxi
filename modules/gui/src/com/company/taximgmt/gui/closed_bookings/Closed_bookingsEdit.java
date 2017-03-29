package com.company.taximgmt.gui.closed_bookings;

import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.taximgmt.entity.Closed_bookings;
import com.haulmont.cuba.gui.components.*;

import javax.inject.Inject;

public class Closed_bookingsEdit extends AbstractEditor<Closed_bookings> implements Field.Validator {

@Inject
    private Field integerField;

    public void validate() {
        try {
            integerField.validate();
            showNotification("Validation successful", NotificationType.HUMANIZED);
        } catch (ValidationException e) {
            showNotification("Validation failed: " + e.getMessage(), NotificationType.ERROR);
        }
    }
    @Override
    public void validate(Object value) throws ValidationException {
        Integer i = (Integer) value;
        if (i <= 0) {
            throw new ValidationException("Value must be positive");
        }
    }
}
