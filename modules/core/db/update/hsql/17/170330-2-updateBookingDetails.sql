alter table TAXIMGMT_BOOKING_DETAILS drop column DATE_ cascade ;
alter table TAXIMGMT_BOOKING_DETAILS add column DATE_ varchar(255) default '' not null ;
