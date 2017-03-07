alter table TAXIMGMT_DRIVER_DETAILS add column EMP_ID varchar(255) default '' not null ;
alter table TAXIMGMT_DRIVER_DETAILS drop column DRIVER_ID cascade ;
