package com.company.taximgmt.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;
import javax.persistence.Inheritance;
import javax.persistence.DiscriminatorColumn;

@Table(name = "TAXIMGMT_DASHBOARD")
@Entity(name = "taximgmt$Dashboard")
public class Dashboard extends StandardEntity {
    private static final long serialVersionUID = 1768150914388415835L;

}