alter table TAXIMGMT_BOOKING_DETAILS drop column DESTINATION_TIME cascade ;
alter table TAXIMGMT_BOOKING_DETAILS add column DESTINATION_TIME time default current_time not null ;
