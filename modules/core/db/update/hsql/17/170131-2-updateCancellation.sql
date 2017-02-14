alter table TAXIMGMT_CANCELLATION add column CUSTOMER_NAME varchar(255) default '' not null ;
alter table TAXIMGMT_CANCELLATION add column DATE_ date default current_date not null ;
alter table TAXIMGMT_CANCELLATION add column TIME_ time default current_time not null ;
alter table TAXIMGMT_CANCELLATION add column CAR_NUMBER varchar(255) default '' not null ;
