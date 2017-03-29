alter table TAXIMGMT_ACCOUNTS drop column DAILY_WAGES cascade ;
alter table TAXIMGMT_ACCOUNTS add column DAILY_WAGES integer default 0 not null ;
alter table TAXIMGMT_ACCOUNTS drop column AMOUNT cascade ;
alter table TAXIMGMT_ACCOUNTS add column AMOUNT integer default 0 not null ;
