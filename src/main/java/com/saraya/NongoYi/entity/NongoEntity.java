package com.saraya.NongoYi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nongo_yi")
public class NongoEntity {
    @Id
    @Column
    private String prenomNom;
    private String adress;
    private Long phoneNumber;

    public NongoEntity() {
    }

    public NongoEntity(String prenomNom, String adress, Long phoneNumber) {
        this.prenomNom = prenomNom;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public String getPrenomNom() {
        return prenomNom;
    }

    public void setPrenomNom(String prenomNom) {
        this.prenomNom = prenomNom;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
