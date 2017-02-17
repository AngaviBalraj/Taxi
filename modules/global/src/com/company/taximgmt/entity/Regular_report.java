package com.company.taximgmt.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "TAXIMGMT_REGULAR_REPORT")
@Entity(name = "taximgmt$Regular_report")
public class Regular_report extends StandardEntity {
    private static final long serialVersionUID = 622921030113085494L;


}