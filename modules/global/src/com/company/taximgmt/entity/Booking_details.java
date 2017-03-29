package com.company.taximgmt.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "TAXIMGMT_BOOKING_DETAILS")
@Entity(name = "taximgmt$Booking_details")
public class Booking_details extends StandardEntity {
    private static final long serialVersionUID = 7147034724064439288L;

    @Column(name = "CUSTOMER_ID", nullable = false, unique = true)
    protected String customer_id;

    @Column(name = "CUSTOMER_NAME", nullable = false)
    protected String customer_name;

    @Column(name = "EMP_ID", nullable = false)
    protected String emp_id;

    @Column(name = "PHONE_NUMBER", nullable = false)
    protected String phone_number;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_",nullable=false)
    protected Date date;

    @Column(name = "SOURCE", nullable = false)
    protected String source;

    @Temporal(TemporalType.TIME)
    @Column(name = "SOURCE_TIME", nullable = false)
    protected Date source_time;

    @Column(name = "DESTINATION", nullable = false)
    protected String destination;

    @Temporal(TemporalType.TIME)
    @Column(name = "DESTINATION_TIME", nullable = false)
    protected Date destination_time;

    @Column(name = "CARD", nullable = false)
    protected String card;

    @Column(name = "BANK_NAME")
    protected String bank_name;

    @Column(name = "AMOUNT", nullable = false)
    protected Integer amount;

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }



    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }



    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_id() {
        return emp_id;
    }


    public Date getDestination_time() {
        return destination_time;
    }

    public void setDestination_time(Date destination_time) {
        this.destination_time = destination_time;
    }


    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setSource_time(Date source_time) {
        this.source_time = source_time;
    }

    public Date getSource_time() {
        return source_time;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getCard() {
        return card;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBank_name() {
        return bank_name;
    }


}