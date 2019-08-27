package com.example.device.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Device")
public class DeviceModel implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    Long id;
    
     @Column(name="MacID")
        Integer MacID;

    public DeviceModel() {
    }

    public DeviceModel(Long id, Integer MacID) {
        this.id = id;
        this.MacID = MacID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMacID() {
        return MacID;
    }

    public void setMacID(Integer MacID) {
        this.MacID = MacID;
    }

    
}

