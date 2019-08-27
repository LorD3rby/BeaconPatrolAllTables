package com.example.conns_r.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name = "ConnS_R")
public class ConnS_R_Model implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    Long id;
    
    
    @Column(name="staff_id")
        Long staff_id;
    
    @Column(name="company_id")
        String company_id;

    public ConnS_R_Model() {
    }

    public ConnS_R_Model(Long id, Long staff_id, String company_id) {
        this.id = id;
        this.staff_id = staff_id;
        this.company_id = company_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(Long staff_id) {
        this.staff_id = staff_id;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }
    
    
    
}
