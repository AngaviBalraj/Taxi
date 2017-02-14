alter table TAXIMGMT_BOOKING__DETAILS add column PHONE_NUM varchar(255) default '' not null ;
alter table TAXIMGMT_BOOKING__DETAILS drop column PHONE_NUMBER cascade ;
