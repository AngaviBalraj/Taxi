alter table TAXIMGMT_DRIVER_DETAILS drop column JOIN_DATE cascade ;
alter table TAXIMGMT_DRIVER_DETAILS add column JOIN_DATE varchar(255) default '' not null ;
