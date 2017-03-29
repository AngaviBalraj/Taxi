package com.company.taximgmt.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "TAXIMGMT_ACCOUNTS")
@Entity(name = "taximgmt$Accounts")
public class Accounts extends StandardEntity {
    private static final long serialVersionUID = -4083457465554811731L;

    @Column(name = "EMPLOYEE_ID", nullable = false)
    protected String employee_id;

    @Column(name = "CAR_NUMBER", nullable = false, unique = true)
    protected String car_number;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_", nullable = false)
    protected Date date;

    @Column(name = "DAILY_WAGES", nullable = false)
    protected Integer daily_wages;

    @Column(name = "MONTH_")
    protected String month;

    @Column(name = "AMOUNT", nullable = false)
    protected Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }


    public Integer getDaily_wages() {
        return daily_wages;
    }

    public void setDaily_wages(Integer daily_wages) {
        this.daily_wages = daily_wages;
    }


    public void setMonth(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }


    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_id() {
        return employee_id;
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


}