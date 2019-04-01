package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "companyDetail")
public class companyDetail {
    @Id
    @GeneratedValue
    private int id;
    private int employeStrength;
    private String notes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeStrength() {
        return employeStrength;
    }

    public void setEmployeStrength(int employeStrength) {
        this.employeStrength = employeStrength;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public companyDetail(int employeStrength, String notes) {
        this.employeStrength = employeStrength;
        this.notes = notes;
    }
}
