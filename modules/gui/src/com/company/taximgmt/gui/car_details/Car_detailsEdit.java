package com.company.taximgmt.gui.car_details;

import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.taximgmt.entity.Car_details;
import com.haulmont.cuba.gui.components.*;

import javax.inject.Inject;

public class Car_detailsEdit extends AbstractEditor<Car_details> implements Field.Validator {

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