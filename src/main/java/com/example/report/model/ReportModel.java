package com.example.report.model;



import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "Report")
public class ReportModel implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
         Long id;
    
     @Column(name="staff_name")
        String staff_name;
    
    @Column(name="time_of_day")
        Date time_of_day;    
    
    @Column(name="is_done")
        Integer is_done;
    
    @Column(name="route_name")
        String route_name;

    public ReportModel() {
    }

    public ReportModel(Long id, String staff_name, Date time_of_day, Integer is_done, String route_name) {
        this.id = id;
        this.staff_name = staff_name;
        this.time_of_day = time_of_day;
        this.is_done = is_done;
        this.route_name = route_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public Date getTime_of_day() {
        return time_of_day;
    }

    public void setTime_of_day(Date time_of_day) {
        this.time_of_day = time_of_day;
    }

    public Integer getIs_done() {
        return is_done;
    }

    public void setIs_done(Integer is_done) {
        this.is_done = is_done;
    }

    public String getRoute_name() {
        return route_name;
    }

    public void setRoute_name(String route_name) {
        this.route_name = route_name;
    }
    
    
    
    
    
}
