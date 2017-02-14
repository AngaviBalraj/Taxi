alter table TAXIMGMT_CUSTOMER_DETAILS add column SOC_TIME time default current_time not null ;
alter table TAXIMGMT_CUSTOMER_DETAILS add column DES_TIME time default current_time not null ;
alter table TAXIMGMT_CUSTOMER_DETAILS drop column TIME_ cascade ;
