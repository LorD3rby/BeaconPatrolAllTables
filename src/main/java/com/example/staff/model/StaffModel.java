package com.example.staff.model;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Staff")
public class StaffModel implements Serializable {
    
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="id")
        Long id;
        
        @Column(name = "company_code")
        Long company_code;
        
    @Column(name="name")
        String name;    
    
    @Column(name="password")
        String password;
    
    public StaffModel() {
    }

    public StaffModel(Long id, Long company_code, String name, String password) {
        this.id = id;
        this.company_code = company_code;
        this.name = name;
        this.password = password;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompany_code() {
        return company_code;
    }

    public void setCompany_code(Long company_code) {
        this.company_code = company_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

    
}

