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
    CUSTOMER_NAME varchar(255) not null,
    CUSTOMER_PHNO varchar(255) not null,
    SOURCE varchar(255) not null,
    DESTINATION varchar(255) not null,
    DATE_ date not null,
    TIME_ time not null,
    KILOMETER varchar(255) not null,
    AMOUNT varchar(255) not null,
    --
    primary key (ID)
);
