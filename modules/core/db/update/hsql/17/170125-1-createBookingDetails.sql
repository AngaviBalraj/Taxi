create table TAXIMGMT_BOOKING__DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_NAME varchar(255) not null,
    PHONE_NUMBER varchar(255),
    DATE_ date not null,
    TIME_ time not null,
    SOURCE varchar(255) not null,
    DESTINAION varchar(255) not null,
    --
    primary key (ID)
);
