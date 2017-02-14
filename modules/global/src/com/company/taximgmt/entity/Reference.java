package com.company.taximgmt.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "TAXIMGMT_REFERENCE")
@Entity(name = "taximgmt$Reference")
public class Reference extends StandardEntity {
    private static final long serialVersionUID = -7873741198314596901L;

    @Column(name = "KILOMETER", nullable = false)
    protected String kilometer;

    @Column(name = "PRICE", nullable = false)
    protected String price;

    @Column(name = "CAR_NAME", nullable = false)
    protected String car_name;

    @Column(name = "CAR_TAX", nullable = false)
    protected String car_tax;

    @Column(name = "DRIVER_TIPS", nullable = false)
    protected String driver_tips;

    @Column(name = "PEAK_HOURS_PRICE", nullable = false)
    protected String peak_hours_price;

    @Column(name = "WAITING_CHARGES", nullable = false)
    protected String waiting_charges;

    public void setKilometer(String kilometer) {
        this.kilometer = kilometer;
    }

    public String getKilometer() {
        return kilometer;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_tax(String car_tax) {
        this.car_tax = car_tax;
    }

    public String getCar_tax() {
        return car_tax;
    }

    public void setDriver_tips(String driver_tips) {
        this.driver_tips = driver_tips;
    }

    public String getDriver_tips() {
        return driver_tips;
    }

    public void setPeak_hours_price(String peak_hours_price) {
        this.peak_hours_price = peak_hours_price;
    }

    public String getPeak_hours_price() {
        return peak_hours_price;
    }

    public void setWaiting_charges(String waiting_charges) {
        this.waiting_charges = waiting_charges;
    }

    public String getWaiting_charges() {
        return waiting_charges;
    }


}