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
    CUSTOMER_ID varchar(255) not null,
    CUSTOMER_NAME varchar(255) not null,
    PHONE_NUMBER varchar(255) not null,
    DATE_ date not null,
    SOURCE varchar(255) not null,
    SOURCE_TIME time not null,
    DESTINATION varchar(255) not null,
    DESTINATION_TIME varchar(255) not null,
    CARD varchar(255) not null,
    BANK_NAME varchar(255),
    AMOUNT varchar(255) not null,
    --
    primary key (ID)
);
