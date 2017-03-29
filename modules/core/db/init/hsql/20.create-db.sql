-- begin TAXIMGMT_CUSTOMER_DETAILS
create unique index IDX_TAXIMGMT_CUSTOMER_DETAILS_UNIQ_CUSTOMER_ID on TAXIMGMT_CUSTOMER_DETAILS (CUSTOMER_ID) ^
-- end TAXIMGMT_CUSTOMER_DETAILS

-- begin TAXIMGMT_DRIVER_DETAILS
create unique index IDX_TAXIMGMT_DRIVER_DETAILS_UNIQ_EMP_ID on TAXIMGMT_DRIVER_DETAILS (EMP_ID) ^
-- end TAXIMGMT_DRIVER_DETAILS
-- begin TAXIMGMT_BOOKING_DETAILS
create unique index IDX_TAXIMGMT_BOOKING_DETAILS_UNIQ_CUSTOMER_ID on TAXIMGMT_BOOKING_DETAILS (CUSTOMER_ID) ^
-- end TAXIMGMT_BOOKING_DETAILS
-- begin TAXIMGMT_ACCOUNTS
create unique index IDX_TAXIMGMT_ACCOUNTS_UNIQ_CAR_NUMBER on TAXIMGMT_ACCOUNTS (CAR_NUMBER) ^
-- end TAXIMGMT_ACCOUNTS
-- begin TAXIMGMT_CAR_DETAILS
create unique index IDX_TAXIMGMT_CAR_DETAILS_UNIQ_CAR_NUMBER on TAXIMGMT_CAR_DETAILS (CAR_NUMBER) ^
-- end TAXIMGMT_CAR_DETAILS
