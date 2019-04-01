package com.example.demo;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "company")
public class company {
    @Id
    @GeneratedValue

    private int id;
    private String name;
    private int statusId;
    private Date version;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStatusId() {
        return statusId;
    }

    public Date getVersion() {
        return version;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public void setVersion(Date version) {
        this.version = version;
    }

    @ManyToOne
    @JoinColumn( name="statusId_fk" ,nullable=false, foreignKey=@ForeignKey(name = "statusId_fk"))
    private companyStatus CompanyStatus;

    @OneToMany(mappedBy = "Company", cascade = CascadeType.ALL)
    private Set<contact> Contacts;


    public company(String name, int statusId, Date version) {
        this.name = name;
        this.statusId = statusId;
        this.version = version;
    }
}
