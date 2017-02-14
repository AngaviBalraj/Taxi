create table TAXIMGMT_DAILY_UPDATES (
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
    DATE_ date not null,
    TIME_ time not null,
    WORK_ varchar(255) not null,
    --
    primary key (ID)
);
