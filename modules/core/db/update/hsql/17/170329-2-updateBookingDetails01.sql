alter table TAXIMGMT_BOOKING_DETAILS drop column PHONE_NUMBER cascade ;
alter table TAXIMGMT_BOOKING_DETAILS add column PHONE_NUMBER varchar(255) default '' not null ;
