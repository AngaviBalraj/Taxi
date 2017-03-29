alter table TAXIMGMT_CLOSED_BOOKINGS drop column AMOUNT cascade ;
alter table TAXIMGMT_CLOSED_BOOKINGS add column AMOUNT integer default 0 not null ;
