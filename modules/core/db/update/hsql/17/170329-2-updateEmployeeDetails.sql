alter table TAXIMGMT_EMPLOYEE_DETAILS drop column PHONE_NUMBER cascade ;
alter table TAXIMGMT_EMPLOYEE_DETAILS add column PHONE_NUMBER integer default 0 not null ;
