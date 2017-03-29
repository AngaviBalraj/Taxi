alter table TAXIMGMT_CUSTOMER_DETAILS drop column PHONENUMBER cascade ;
alter table TAXIMGMT_CUSTOMER_DETAILS add column PHONENUMBER integer default 0 not null ;
alter table TAXIMGMT_CUSTOMER_DETAILS drop column ALTERNATE_PH_NUMBER cascade ;
alter table TAXIMGMT_CUSTOMER_DETAILS add column ALTERNATE_PH_NUMBER integer default 0 not null ;
