package com.example.demo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "contactDetail")
public class contactDetail {

    @Id
    @GeneratedValue

    private int id;
    private int gender;
    private Date dateOfBirth;
    private int contactId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    @ManyToOne
    @JoinColumn
    private contact Contact;

    public contactDetail(int gender, Date dateOfBirth, int contactId) {
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.contactId = contactId;
    }
}
