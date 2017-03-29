package com.company.taximgmt.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.ConstraintCheckType;

@Table(name = "TAXIMGMT_CURRENT_STATUS")
@Entity(name = "taximgmt$Current_status")
public class Current_status extends StandardEntity {
    private static final long serialVersionUID = 71615377912528772L;

    @Column(name = "CUSTOMER_ID", nullable = false)
    protected String customer_id;

    @Column(name = "DRIVER_ID", nullable = false)
    protected String driver_id;

    @Column(name = "CAR_NUMBER", nullable = false)
    protected String car_number;

    @Column(name = "STATUS", nullable = false)
    protected String status;

    public Status getStatus() {
        return status == null ? null : Status.fromId(status);
    }

    public void setStatus(Status status) {
        this.status = status == null ? null : status.getId();
    }



    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setDriver_id(String driver_id) {
        this.driver_id = driver_id;
    }

    public String getDriver_id() {
        return driver_id;
    }

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }

    public String getCar_number() {
        return car_number;
    }


}