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
    CAR_ASSIGNED boolean,
    CAR_BOOKED boolean,
    STARTED boolean,
    RUNNING boolean,
    --
    primary key (ID)
);
