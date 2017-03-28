alter table TAXIMGMT_ACCOUNTS add column MONTH_ varchar(255) default '' not null ;
alter table TAXIMGMT_ACCOUNTS add column AMOUNT varchar(255) default '' not null ;
alter table TAXIMGMT_ACCOUNTS drop column CUSTOMIZED_DATE cascade ;
alter table TAXIMGMT_ACCOUNTS drop column TOTAL_AMOUNT cascade ;
