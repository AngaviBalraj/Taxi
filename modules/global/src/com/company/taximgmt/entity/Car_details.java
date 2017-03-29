package com.company.taximgmt.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamePattern("  %s %s %s|car_name,car_number,seats")
@Table(name = "TAXIMGMT_CAR_DETAILS")
@Entity(name = "taximgmt$Car_details")
public class Car_details extends StandardEntity {
    private static final long serialVersionUID = -6350931772041916566L;

    @Column(name = "CAR_NUMBER", nullable = false, unique = true)
    protected String car_number;

    @Column(name = "CAR_NAME", nullable = false)
    protected String car_name;

    @Column(name = "SEATS", nullable = false)
    protected Integer seats;




    @Temporal(TemporalType.DATE)
    @Column(name = "SERVICE_DATE", nullable = false)
    protected Date service_date;

    @Column(name = "DESCRIPTION", nullable = false)
    protected String description;

    @Column(name = "AMOUNT", nullable = false)
    protected Integer amount;

    @Column(name = "FUEL", nullable = false)
    protected String fuel;

    @Column(name = "ACTIVE", nullable = false)
    protected Boolean active = false;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }


    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getActive() {
        return active;
    }


    public void setDescription(String description) {
        this.description = description;
    }



    public void setFuel(String fuel) {
        this.fuel = fuel;
    }


    public void setService_date(Date service_date) {
        this.service_date = service_date;
    }

    public Date getService_date() {
        return service_date;
    }

    public String getDescription() {
        return description;
    }

    public String getFuel() {
        return fuel;
    }


    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getCar_name() {
        return car_name;
    }


    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }

    public String getCar_number() {
        return car_number;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Integer getSeats() {
        return seats;
    }


}