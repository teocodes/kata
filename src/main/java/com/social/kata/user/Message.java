package com.social.kata.user;

import java.util.Date;

public class Message {

    private String username;
    private String message;
    private Date sendDate;

    public Message(String username, String message, Date sendDate) {
        this.username = username;
        this.message = message;
        this.sendDate = sendDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }
}
