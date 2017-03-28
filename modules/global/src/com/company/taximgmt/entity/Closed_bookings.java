package com.company.taximgmt.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "TAXIMGMT_CLOSED_BOOKINGS")
@Entity(name = "taximgmt$Closed_bookings")
public class Closed_bookings extends StandardEntity {
    private static final long serialVersionUID = 9163900998663695951L;

    @Column(name = "CUSTOMER_ID", nullable = false)
    protected String customer_id;

    @Column(name = "EMPLOYEE_ID", nullable = false)
    protected String employee_id;

    @Column(name = "CAR_NUMBER", nullable = false)
    protected String car_number;

    @Column(name = "SOURCE", nullable = false)
    protected String source;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SOURCE_TIME", nullable = false)
    protected Date source_time;

    @Column(name = "DESTINATION", nullable = false)
    protected String destination;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DESTINATION_TIME", nullable = false)
    protected Date destination_time;

    @Column(name = "BANK_DETAILS")
    protected String bank_details;

    @Column(name = "CARD")
    protected String card;

    @Column(name = "AMOUNT", nullable = false)
    protected String amount;

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_id() {
        return customer_id;
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

    public void setDestination_time(Date destination_time) {
        this.destination_time = destination_time;
    }

    public Date getDestination_time() {
        return destination_time;
    }

    public void setBank_details(String bank_details) {
        this.bank_details = bank_details;
    }

    public String getBank_details() {
        return bank_details;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getCard() {
        return card;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }


}