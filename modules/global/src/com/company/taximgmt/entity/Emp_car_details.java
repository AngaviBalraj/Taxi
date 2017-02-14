package com.company.taximgmt.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "TAXIMGMT_EMP_CAR_DETAILS")
@Entity(name = "taximgmt$Emp_car_details")
public class Emp_car_details extends StandardEntity {
    private static final long serialVersionUID = -6989775628874525448L;

    @Column(name = "EMP_ID", nullable = false)
    protected String emp_id;

    @Column(name = "EMP_CAR_NO", nullable = false, unique = true)
    protected String emp_car_no;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_", nullable = false)
    protected Date date;

    @Column(name = "SOURCE", nullable = false)
    protected String source;

    @Temporal(TemporalType.TIME)
    @Column(name = "SOURCE_TIME", nullable = false)
    protected Date source_time;

    @Column(name = "DESTINATION", nullable = false)
    protected String destination;

    @Temporal(TemporalType.TIME)
    @Column(name = "DES_TIME", nullable = false)
    protected Date des_time;

    @Column(name = "RATING", nullable = false)
    protected Integer rating;

    public Date getDes_time() {
        return des_time;
    }

    public void setDes_time(Date des_time) {
        this.des_time = des_time;
    }


    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_car_no(String emp_car_no) {
        this.emp_car_no = emp_car_no;
    }

    public String getEmp_car_no() {
        return emp_car_no;
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

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getRating() {
        return rating;
    }


}