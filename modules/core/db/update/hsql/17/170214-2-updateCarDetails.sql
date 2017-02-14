alter table TAXIMGMT_CAR_DETAILS add column SERVICE_DATE date default current_date not null ;
alter table TAXIMGMT_CAR_DETAILS add column DESCRIPTION varchar(255) default '' not null ;
alter table TAXIMGMT_CAR_DETAILS add column AMOUNT varchar(255) default '' not null ;
alter table TAXIMGMT_CAR_DETAILS add column FUEL varchar(255) default '' not null ;
