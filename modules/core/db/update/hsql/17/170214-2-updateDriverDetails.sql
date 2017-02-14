alter table TAXIMGMT_DRIVER_DETAILS add column PHONE_NUMBER varchar(255) default '' not null ;
alter table TAXIMGMT_DRIVER_DETAILS add column LICENCE_NUMBER varchar(255) default '' not null ;
alter table TAXIMGMT_DRIVER_DETAILS add column CAR_NUMBER varchar(255) default '' not null ;
alter table TAXIMGMT_DRIVER_DETAILS add column DISPATCH_TIME timestamp default current_timestamp not null ;
alter table TAXIMGMT_DRIVER_DETAILS add column END_TIME time default current_time not null ;
alter table TAXIMGMT_DRIVER_DETAILS drop column DRIVER_CAR_NUMBER cascade ;
