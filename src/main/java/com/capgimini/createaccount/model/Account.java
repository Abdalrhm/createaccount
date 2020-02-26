package com.capgimini.createaccount.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    private Long id;
    private String EmailAdress;
    private int Wachtwoord;

    public Account() {
    }

    public Account(Long id, String emailAdress, int wachtwoord) {
        this.id = id;
        EmailAdress = emailAdress;
        Wachtwoord = wachtwoord;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailAdress() {
        return EmailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        EmailAdress = emailAdress;
    }

    public int getWachtwoord() {
        return Wachtwoord;
    }

    public void setWachtwoord(int wachtwoord) {
        Wachtwoord = wachtwoord;
    }
}
