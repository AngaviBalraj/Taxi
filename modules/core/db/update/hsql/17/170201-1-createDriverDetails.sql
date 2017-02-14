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
    DRIVER_ID varchar(255) not null,
    DRIVER_NAME varchar(255) not null,
    DRIVER_CAR_NUMBER varchar(255) not null,
    --
    primary key (ID)
);
