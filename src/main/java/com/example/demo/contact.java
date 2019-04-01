package com.example.demo;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "contact")
public class contact {

    @Id
    @GeneratedValue

    private int id;
    private String firstName;
    private String lastName;
    private String telephone;
    private String email;
    private Date version;
    private int companyId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getVersion() {
        return version;
    }

    public void setVersion(Date version) {
        this.version = version;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    @ManyToOne
    @JoinColumn(foreignKey=@ForeignKey(name = "companyId_fk"))
    private company Company;

    @OneToMany(mappedBy = "Contact", cascade = CascadeType.ALL)
    private Set<contactDetail> ContactDetails;

    public contact(String firstName, String lastName, String telephone, String email, Date version, int companyId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.email = email;
        this.version = version;
        this.companyId = companyId;
    }
}

