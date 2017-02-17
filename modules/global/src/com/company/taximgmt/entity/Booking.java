package com.company.taximgmt.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "TAXIMGMT_BOOKING")
@Entity(name = "taximgmt$Booking")
public class Booking extends StandardEntity {
    private static final long serialVersionUID = 3611446569644513131L;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_", nullable = false)
    protected Date date;

    @Column(name = "NO_OF_BOOKINGS", nullable = false)
    protected String no_of_bookings;

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setNo_of_bookings(String no_of_bookings) {
        this.no_of_bookings = no_of_bookings;
    }

    public String getNo_of_bookings() {
        return no_of_bookings;
    }


}