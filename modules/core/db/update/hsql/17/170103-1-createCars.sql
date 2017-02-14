create table TAXIMGMT_CARS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EMP_ID varchar(255),
    DRIVER_NAME varchar(255) not null,
    CAR_DETAILS varchar(255) not null,
    CAR_NUMBER varchar(255) not null,
    SEATS integer not null,
    --
    primary key (ID)
);
