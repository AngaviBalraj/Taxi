update TAXIMGMT_BOOKING_DETAILS set DATE_ = current_date where DATE_ is null ;
alter table TAXIMGMT_BOOKING_DETAILS alter column DATE_ set not null ;
