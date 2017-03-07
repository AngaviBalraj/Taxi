package com.company.taximgmt.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name = "TAXIMGMT_DRIVER_DETAILS")
@Entity(name = "taximgmt$Driver_details")
public class Driver_details extends StandardEntity {
    private static final long serialVersionUID = -4735142307471075192L;

    @Column(name = "EMP_ID", nullable = false, unique = true)
    protected String emp_id;

    @Column(name = "DRIVER_NAME", nullable = false)
    protected String driver_name;

    @Column(name = "PHONE_NUMBER", nullable = false)
    protected String phone_number;

    @Column(name = "CAR_NUMBER", nullable = false)
    protected String car_number;

    @Column(name = "LICENCE_NUMBER", nullable = false)
    protected String licence_number;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "JOIN_DATE", nullable = false)
    protected Date join_date;


    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_id() {
        return emp_id;
    }


    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
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

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }

    public String getCar_number() {
        return car_number;
    }

    public void setLicence_number(String licence_number) {
        this.licence_number = licence_number;
    }

    public String getLicence_number() {
        return licence_number;
    }



}