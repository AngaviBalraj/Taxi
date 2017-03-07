alter table TAXIMGMT_DRIVER_DETAILS add column JOIN_DATE date default current_date not null ;
alter table TAXIMGMT_DRIVER_DETAILS drop column DATE_ cascade ;
alter table TAXIMGMT_DRIVER_DETAILS drop column START_TIME cascade ;
alter table TAXIMGMT_DRIVER_DETAILS drop column END_TIME cascade ;
