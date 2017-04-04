package com.company.taximgmt.gui.booking_details;

import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.taximgmt.entity.Booking_details;
import com.haulmont.cuba.gui.components.*;
import javax.inject.Inject;
import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.core.global.Metadata;
import java.util.Date;
import java.util.Map;

public class Booking_detailsEdit extends AbstractEditor<Booking_details>  implements Field.Validator {

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


