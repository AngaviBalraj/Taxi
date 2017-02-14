alter table TAXIMGMT_EMP_CAR_DETAILS drop column DES_TIME cascade ;
alter table TAXIMGMT_EMP_CAR_DETAILS add column DES_TIME time default current_time not null ;
