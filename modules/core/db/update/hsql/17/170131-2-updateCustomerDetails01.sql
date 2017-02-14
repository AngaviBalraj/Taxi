alter table TAXIMGMT_CUSTOMER_DETAILS add column TIME_ time default current_time not null ;
alter table TAXIMGMT_CUSTOMER_DETAILS drop column KILOMETER cascade ;
alter table TAXIMGMT_CUSTOMER_DETAILS drop column AMOUNT cascade ;
