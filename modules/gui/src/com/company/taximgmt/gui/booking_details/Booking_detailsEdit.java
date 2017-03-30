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
   
    @Inject 
    private Field dateField;
    @Inject
    private Label date1;
   // @Inject
   // private Field date;
    @Inject 
    private TimeSource timeSource;
    @Inject 
    private Metadata metadata;
      //@Inject
       //private Datasource<Booking_details> booking_detailsDs;

       //@Override 
        //protected void initNewItem(Booking_details item) {
              // booking_detailsDs.setBooking_detailsStartDate(new Date());
               //booking_detailsDs.setBooking_detailsEndDate(new Date());
        //}
    @Override
    public void init(Map<String, Object> params){
    //Booking_details book = metadata.create(Booking_details.class);
//    //book.setDate(timeSource.currentTimestamp());
    
    }

    public void validate() {
        try {
            //integerField.validate();
          // showNotification("Validation successful", NotificationType.HUMANIZED);
        dateField.validate();
          showNotification("Validation successful", NotificationType.HUMANIZED);
        } catch (ValidationException e) {
            showNotification("Validation failed: " + e.getMessage(), NotificationType.ERROR);
        }
    }
    
    @Override
    public void validate(Object value) throws ValidationException {
      // Integer i = (Integer) value;
       
        Date date = (Date) value;
       //if (i <= 0) {
         //throw new ValidationException("Value must be positive");
            
       // }
       if(date!=(timeSource.currentTimestamp()))
        {
        throw new ValidationException("Invalid date");
            
        }
        
    }
    
}
