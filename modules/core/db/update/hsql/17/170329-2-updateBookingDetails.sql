alter table TAXIMGMT_BOOKING_DETAILS drop column PHONE_NUMBER cascade ;
alter table TAXIMGMT_BOOKING_DETAILS add column PHONE_NUMBER integer default 0 not null ;
alter table TAXIMGMT_BOOKING_DETAILS drop column AMOUNT cascade ;
alter table TAXIMGMT_BOOKING_DETAILS add column AMOUNT integer default 0 not null ;
