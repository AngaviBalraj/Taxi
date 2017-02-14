alter table TAXIMGMT_EMPLOYEE_DETAILS add column PHONE_NUMBER varchar(255) default '' not null ;
alter table TAXIMGMT_EMPLOYEE_DETAILS add column ADDRESS varchar(255) default '' not null ;
alter table TAXIMGMT_EMPLOYEE_DETAILS add column WORK_TYPE varchar(255) default '' not null ;
alter table TAXIMGMT_EMPLOYEE_DETAILS drop column EMP_PHNO cascade ;
alter table TAXIMGMT_EMPLOYEE_DETAILS drop column EMP_ADDRESS cascade ;
alter table TAXIMGMT_EMPLOYEE_DETAILS drop column EMP_TYPE cascade ;
alter table TAXIMGMT_EMPLOYEE_DETAILS drop column EMP_PROOF cascade ;
alter table TAXIMGMT_EMPLOYEE_DETAILS drop column EMP_LIC_NUM cascade ;
