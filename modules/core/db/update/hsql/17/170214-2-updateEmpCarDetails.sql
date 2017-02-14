update TAXIMGMT_EMP_CAR_DETAILS set RATING = 0 where RATING is null ;
alter table TAXIMGMT_EMP_CAR_DETAILS alter column RATING set not null ;
