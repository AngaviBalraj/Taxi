create table TAXIMGMT_EMPLOYEE_DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EMP_ID varchar(255) not null,
    EMP_NAME varchar(255) not null,
    EMP_PHNO varchar(255) not null,
    EMP_ADDRESS varchar(255) not null,
    EMP_DRIVING_LIC_NUM varchar(255) not null,
    --
    primary key (ID)
);
