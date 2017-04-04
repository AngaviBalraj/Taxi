alter table TAXIMGMT_CUSTOMER_DETAILS drop column PHONENUMBER cascade ;
alter table TAXIMGMT_CUSTOMER_DETAILS add column PHONENUMBER varchar(255) default '' not null ;
alter table TAXIMGMT_CUSTOMER_DETAILS drop column ALTERNATE_PH_NUMBER cascade ;
alter table TAXIMGMT_CUSTOMER_DETAILS add column ALTERNATE_PH_NUMBER varchar(255) default '' not null ;
