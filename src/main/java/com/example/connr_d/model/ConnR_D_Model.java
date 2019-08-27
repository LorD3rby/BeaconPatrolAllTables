package com.example.connr_d.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "ConnR_D")
public class ConnR_D_Model implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    Long id;
    
     @Column(name="staff_id")
        Long staff_id;
    
    @Column(name="route_id")
        Long route_id;    

    public ConnR_D_Model() {
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

    public Long getRoute_id() {
        return route_id;
    }

    public void setRoute_id(Long route_id) {
        this.route_id = route_id;
    }

    public ConnR_D_Model(Long id, Long staff_id, Long route_id) {
        this.id = id;
        this.staff_id = staff_id;
        this.route_id = route_id;
    }
    
    
    
}
