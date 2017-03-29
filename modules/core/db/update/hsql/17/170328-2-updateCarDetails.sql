alter table TAXIMGMT_CAR_DETAILS drop column AMOUNT cascade ;
alter table TAXIMGMT_CAR_DETAILS add column AMOUNT integer default 0 not null ;
