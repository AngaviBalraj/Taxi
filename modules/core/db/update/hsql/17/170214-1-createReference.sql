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
);
