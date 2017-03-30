-- begin TAXIMGMT_CUSTOMER_DETAILS
create table TAXIMGMT_CUSTOMER_DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_ID varchar(255) not null,
    CUSTOMER_NAME varchar(255) not null,
    EMAIL_ID varchar(255) not null,
    ADDRESS varchar(255) not null,
    PHONENUMBER integer not null,
    ALTERNATE_PH_NUMBER integer not null,
    --
    primary key (ID)
)^-- end TAXIMGMT_CUSTOMER_DETAILS

-- begin TAXIMGMT_EMPLOYEE_DETAILS
create table TAXIMGMT_EMPLOYEE_DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EMP_ID varchar(255) not null,
    EMP_NAME varchar(255) not null,
    PHONE_NUMBER integer not null,
    ADDRESS varchar(255) not null,
    WORK_TYPE varchar(255) not null,
    --
    primary key (ID)
)^-- end TAXIMGMT_EMPLOYEE_DETAILS

-- begin TAXIMGMT_CAR_DETAILS
create table TAXIMGMT_CAR_DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CAR_NUMBER varchar(255) not null,
    CAR_NAME varchar(255) not null,
    SEATS integer not null,
    SERVICE_DATE date not null,
    DESCRIPTION varchar(255) not null,
    AMOUNT integer not null,
    FUEL varchar(255) not null,
    ACTIVE boolean not null,
    --
    primary key (ID)
)^-- end TAXIMGMT_CAR_DETAILS

-- begin TAXIMGMT_REFERENCE
create table TAXIMGMT_REFERENCE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    KILOMETER integer not null,
    PRICE integer not null,
    CAR_NAME varchar(255) not null,
    CAR_TAX integer not null,
    DRIVER_TIPS integer not null,
    PEAK_HOURS_PRICE integer not null,
    WAITING_CHARGES integer not null,
    --
    primary key (ID)
)^
-- end TAXIMGMT_REFERENCE
-- begin TAXIMGMT_DRIVER_DETAILS
create table TAXIMGMT_DRIVER_DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EMP_ID varchar(255) not null,
    DRIVER_NAME varchar(255) not null,
    PHONE_NUMBER varchar(255) not null,
    CAR_NUMBER varchar(255) not null,
    LICENCE_NUMBER varchar(255) not null,
    JOIN_DATE timestamp not null,
    --
    primary key (ID)
)^
-- end TAXIMGMT_DRIVER_DETAILS
-- begin TAXIMGMT_BOOKING_DETAILS
create table TAXIMGMT_BOOKING_DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_ID varchar(255),
    CUSTOMER_NAME varchar(255) not null,
    EMP_ID varchar(255) not null,
    PHONE_NUMBER varchar(255) not null,
    DATE_ date not null,
    SOURCE varchar(255) not null,
    SOURCE_TIME time not null,
    DESTINATION varchar(255) not null,
    DESTINATION_TIME time not null,
    CARD varchar(255) not null,
    BANK_NAME varchar(255),
    AMOUNT integer not null,
    --
    primary key (ID)
)^
-- end TAXIMGMT_BOOKING_DETAILS
-- begin TAXIMGMT_ACCOUNTS
create table TAXIMGMT_ACCOUNTS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EMPLOYEE_ID varchar(255) not null,
    CAR_NUMBER varchar(255) not null,
    DATE_ date not null,
    DAILY_WAGES integer not null,
    MONTH_ varchar(255),
    AMOUNT integer not null,
    --
    primary key (ID)
)^
-- end TAXIMGMT_ACCOUNTS
-- begin TAXIMGMT_CURRENT_STATUS
create table TAXIMGMT_CURRENT_STATUS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_ID varchar(255) not null,
    DRIVER_ID varchar(255) not null,
    CAR_NUMBER varchar(255) not null,
    STATUS varchar(50) not null,
    --
    primary key (ID)
)^
-- end TAXIMGMT_CURRENT_STATUS
-- begin TAXIMGMT_CLOSED_BOOKINGS
create table TAXIMGMT_CLOSED_BOOKINGS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_ID varchar(255) not null,
    EMPLOYEE_ID varchar(255) not null,
    CAR_NUMBER varchar(255) not null,
    SOURCE varchar(255) not null,
    SOURCE_TIME timestamp not null,
    DESTINATION varchar(255) not null,
    DESTINATION_TIME timestamp not null,
    BANK_DETAILS varchar(255),
    CARD varchar(255),
    AMOUNT integer not null,
    --
    primary key (ID)
)^
-- end TAXIMGMT_CLOSED_BOOKINGS
