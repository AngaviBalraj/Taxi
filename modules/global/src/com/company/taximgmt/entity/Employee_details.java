package com.company.taximgmt.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "TAXIMGMT_EMPLOYEE_DETAILS")
@Entity(name = "taximgmt$Employee_details")
public class Employee_details extends StandardEntity {
    private static final long serialVersionUID = -7724593731768062553L;

    @Column(name = "EMP_ID", nullable = false)
    protected String emp_id;

    @Column(name = "EMP_NAME", nullable = false)
    protected String emp_name;

    @Column(name = "PHONE_NUMBER", nullable = false)
    protected String phone_number;

    @Column(name = "ADDRESS", nullable = false)
    protected String address;

    @Column(name = "WORK_TYPE", nullable = false)
    protected String work_type;

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }



    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setWork_type(String work_type) {
        this.work_type = work_type;
    }

    public String getWork_type() {
        return work_type;
    }


}