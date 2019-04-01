package com.example.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "companyStatus")
public class companyStatus {

    @Id
    @GeneratedValue

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "CompanyStatus", cascade = CascadeType.ALL)
    private Set<company> companies;


    public companyStatus(String name) {
        this.name = name;
    }
}
