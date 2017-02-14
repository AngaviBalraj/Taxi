alter table TAXIMGMT_EMPLOYEE_DETAILS add column EMP_TYPE varchar(255) default '' not null ;
alter table TAXIMGMT_EMPLOYEE_DETAILS add column EMP_PROOF varchar(255) default '' not null ;
alter table TAXIMGMT_EMPLOYEE_DETAILS add column EMP_LIC_NUM varchar(255) ;
alter table TAXIMGMT_EMPLOYEE_DETAILS add column EMP_AADHAR_NO varchar(255) ;
alter table TAXIMGMT_EMPLOYEE_DETAILS drop column EMP_DRIVING_LIC_NUM cascade ;
