package com.example.company.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Company")
public class CompanyModel implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    Long company_id;
    
     @Column(name="company_name")
        String company_name;
    
    @Column(name="company_mail")
        String company_mail;    
    
    @Column(name="company_password")
        String company_password;
    
    @Column(name = "company_code")
        Long company_code;


    public CompanyModel() {
    }

    public CompanyModel(Long company_id, String company_name, String company_mail, String company_password, Long company_code) {
        this.company_id = company_id;
        this.company_name = company_name;
        this.company_mail = company_mail;
        this.company_password = company_password;
        this.company_code = company_code;
    }

    public Long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Long company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_mail() {
        return company_mail;
    }

    public void setCompany_mail(String company_mail) {
        this.company_mail = company_mail;
    }

    public String getCompany_password() {
        return company_password;
    }

    public void setCompany_password(String company_password) {
        this.company_password = company_password;
    }

    public Long getCompany_code() {
        return company_code;
    }

    public void setCompany_code(Long company_code) {
        this.company_code = company_code;
    }

    
    
    
}
