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
    protected Integer kilometer;

    @Column(name = "PRICE", nullable = false)
    protected Integer price;

    @Column(name = "CAR_NAME", nullable = false)
    protected String car_name;

    @Column(name = "CAR_TAX", nullable = false)
    protected Integer car_tax;

    @Column(name = "DRIVER_TIPS", nullable = false)
    protected Integer driver_tips;

    @Column(name = "PEAK_HOURS_PRICE", nullable = false)
    protected Integer peak_hours_price;

    @Column(name = "WAITING_CHARGES", nullable = false)
    protected Integer waiting_charges;

    public Integer getKilometer() {
        return kilometer;
    }

    public void setKilometer(Integer kilometer) {
        this.kilometer = kilometer;
    }


    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    public Integer getCar_tax() {
        return car_tax;
    }

    public void setCar_tax(Integer car_tax) {
        this.car_tax = car_tax;
    }


    public Integer getDriver_tips() {
        return driver_tips;
    }

    public void setDriver_tips(Integer driver_tips) {
        this.driver_tips = driver_tips;
    }


    public Integer getPeak_hours_price() {
        return peak_hours_price;
    }

    public void setPeak_hours_price(Integer peak_hours_price) {
        this.peak_hours_price = peak_hours_price;
    }


    public Integer getWaiting_charges() {
        return waiting_charges;
    }

    public void setWaiting_charges(Integer waiting_charges) {
        this.waiting_charges = waiting_charges;
    }


    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getCar_name() {
        return car_name;
    }


}