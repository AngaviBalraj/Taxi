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
    ALTERNATE_PHONE_NUMBER varchar(255) not null,
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
    PHONE_NUMBER varchar(255) not null,
    ADDRESS varchar(255) not null,
    WORK_TYPE varchar(255) not null,
    --
    primary key (ID)
)^-- end TAXIMGMT_EMPLOYEE_DETAILS

-- begin TAXIMGMT_EMP_CAR_DETAILS
create table TAXIMGMT_EMP_CAR_DETAILS (
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
    EMP_CAR_NO varchar(255) not null,
    DATE_ date not null,
    SOURCE varchar(255) not null,
    SOURCE_TIME time not null,
    DESTINATION varchar(255) not null,
    DES_TIME time not null,
    RATING integer not null,
    --
    primary key (ID)
)^
-- end TAXIMGMT_EMP_CAR_DETAILS
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
    AMOUNT varchar(255) not null,
    FUEL varchar(255) not null,
    --
    primary key (ID)
)^
-- end TAXIMGMT_CAR_DETAILS

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
    KILOMETER varchar(255) not null,
    PRICE varchar(255) not null,
    CAR_NAME varchar(255) not null,
    CAR_TAX varchar(255) not null,
    DRIVER_TIPS varchar(255) not null,
    PEAK_HOURS_PRICE varchar(255) not null,
    WAITING_CHARGES varchar(255) not null,
    --
    primary key (ID)
)^
-- end TAXIMGMT_REFERENCE
