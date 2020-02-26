package com.capgimini.createaccount.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Message {
    @Id
    private Long id;
    @ManyToOne
    private Account account;
    @ManyToOne
    private Topic topic;

    public Message() {
    }

    public Message(Long id, Account account, Topic topic) {
        this.id = id;
        this.account = account;
        this.topic = topic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
