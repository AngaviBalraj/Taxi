package com.company.taximgmt.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "TAXIMGMT_DRIVER_DETAILS")
@Entity(name = "taximgmt$Driver_details")
public class Driver_details extends StandardEntity {
    private static final long serialVersionUID = 6155118427472346075L;

    @Column(name = "DRIVER_ID", nullable = false, unique = true)
    protected String driver_id;

    @Column(name = "DRIVER_NAME", nullable = false)
    protected String driver_name;

    @Column(name = "PHONE_NUMBER", nullable = false)
    protected String phone_number;

    @Column(name = "LICENCE_NUMBER", nullable = false)
    protected String licence_number;

    @Column(name = "CAR_NUMBER", nullable = false, unique = true)
    protected String car_number;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_", nullable = false)
    protected Date date;

    @Temporal(TemporalType.TIME)
    @Column(name = "START_TIME", nullable = false)
    protected Date start_time;

    @Temporal(TemporalType.TIME)
    @Column(name = "END_TIME", nullable = false)
    protected Date end_time;

    public void setDriver_id(String driver_id) {
        this.driver_id = driver_id;
    }

    public String getDriver_id() {
        return driver_id;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setLicence_number(String licence_number) {
        this.licence_number = licence_number;
    }

    public String getLicence_number() {
        return licence_number;
    }

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }

    public String getCar_number() {
        return car_number;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Date getEnd_time() {
        return end_time;
    }


}