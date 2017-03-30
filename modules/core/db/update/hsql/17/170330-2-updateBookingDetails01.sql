alter table TAXIMGMT_BOOKING_DETAILS drop column DATE_ cascade ;
alter table TAXIMGMT_BOOKING_DETAILS add column DATE_ date default current_date not null ;
