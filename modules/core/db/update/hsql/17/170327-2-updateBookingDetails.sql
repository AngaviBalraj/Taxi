alter table TAXIMGMT_BOOKING_DETAILS add column EMP_ID varchar(255) default '' not null ;
alter table TAXIMGMT_BOOKING_DETAILS drop column DRIVER_ID cascade ;
