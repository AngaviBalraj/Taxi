alter table TAXIMGMT_CUSTOMER_DETAILS add column CUSTOMER_ID varchar(255) default '' not null ;
alter table TAXIMGMT_CUSTOMER_DETAILS add column EMAIL_ID varchar(255) default '' not null ;
alter table TAXIMGMT_CUSTOMER_DETAILS add column ADDRESS varchar(255) default '' not null ;
alter table TAXIMGMT_CUSTOMER_DETAILS add column ALTERNATE_PHONE_NUMBER varchar(255) default '' not null ;
alter table TAXIMGMT_CUSTOMER_DETAILS drop column CUSTOMER_PHNO cascade ;
alter table TAXIMGMT_CUSTOMER_DETAILS drop column SOURCE cascade ;
alter table TAXIMGMT_CUSTOMER_DETAILS drop column DESTINATION cascade ;
alter table TAXIMGMT_CUSTOMER_DETAILS drop column DATE_ cascade ;
alter table TAXIMGMT_CUSTOMER_DETAILS drop column TIME_ cascade ;
