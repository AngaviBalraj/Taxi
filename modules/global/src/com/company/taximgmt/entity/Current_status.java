package com.company.taximgmt.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

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

    @Column(name = "CAR_BOOKED")
    protected Boolean car_booked;

    @Column(name = "CAR_ASSIGNED")
    protected Boolean car_assigned;

    @Column(name = "STARTED")
    protected Boolean started;

    @Column(name = "RUNNING")
    protected Boolean running;

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

    public void setCar_booked(Boolean car_booked) {
        this.car_booked = car_booked;
    }

    public Boolean getCar_booked() {
        return car_booked;
    }

    public void setCar_assigned(Boolean car_assigned) {
        this.car_assigned = car_assigned;
    }

    public Boolean getCar_assigned() {
        return car_assigned;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public Boolean getStarted() {
        return started;
    }

    public void setRunning(Boolean running) {
        this.running = running;
    }

    public Boolean getRunning() {
        return running;
    }


}