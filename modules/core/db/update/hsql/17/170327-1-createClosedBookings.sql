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
    BANK_DETAILS varchar(255) not null,
    CARD varchar(255),
    AMOUNT varchar(255) not null,
    --
    primary key (ID)
);
