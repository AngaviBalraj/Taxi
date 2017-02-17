create table TAXIMGMT_ACCOUNTS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EMPLOYEE_ID varchar(255) not null,
    CAR_NUMBER varchar(255) not null,
    CUSTOMER_ID varchar(255) not null,
    DATE_ date not null,
    DAILY_WAGES varchar(255) not null,
    CUSTOMIZED_DATE varchar(255) not null,
    TOTAL_AMOUNT varchar(255) not null,
    --
    primary key (ID)
);
