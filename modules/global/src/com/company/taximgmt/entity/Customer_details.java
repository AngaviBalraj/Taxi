package com.company.taximgmt.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "TAXIMGMT_CUSTOMER_DETAILS")
@Entity(name = "taximgmt$Customer_details")
public class Customer_details extends StandardEntity {
    private static final long serialVersionUID = -3035507574693889130L;

    @Column(name = "CUSTOMER_ID", nullable = false, unique = true)
    protected String customer_id;

    @Column(name = "CUSTOMER_NAME", nullable = false)
    protected String customer_name;

    @Column(name = "EMAIL_ID", nullable = false)
    protected String email_id;

    @Column(name = "ADDRESS", nullable = false)
    protected String address;

    @Column(name = "PHONENUMBER", nullable = false)
    protected String phonenumber;

    @Column(name = "ALTERNATE_PH_NUMBER", nullable = false)
    protected String alternate_ph_number;

    public void setAlternate_ph_number(String alternate_ph_number) {
        this.alternate_ph_number = alternate_ph_number;
    }

    public String getAlternate_ph_number() {
        return alternate_ph_number;
    }


    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }


    public void setAddress(String address) {
        this.address = address;
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

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getEmail_id() {
        return email_id;
    }

    public String getAddress() {
        return address;
    }


}