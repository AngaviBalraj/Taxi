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

    @Column(name = "EMPLOYEE_ID", nullable = false, unique = true)
    protected String employee_id;

    @Column(name = "CAR_NUMBER", nullable = false, unique = true)
    protected String car_number;

    @Column(name = "CUSTOMER_ID", nullable = false)
    protected String customer_id;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_", nullable = false)
    protected Date date;

    @Column(name = "DAILY_WAGES", nullable = false)
    protected String daily_wages;

    @Column(name = "CUSTOMIZED_DATE", nullable = false)
    protected String customized_date;

    @Column(name = "TOTAL_AMOUNT", nullable = false)
    protected String total_amount;

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

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDaily_wages(String daily_wages) {
        this.daily_wages = daily_wages;
    }

    public String getDaily_wages() {
        return daily_wages;
    }

    public void setCustomized_date(String customized_date) {
        this.customized_date = customized_date;
    }

    public String getCustomized_date() {
        return customized_date;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getTotal_amount() {
        return total_amount;
    }


}