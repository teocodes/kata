package com.social.kata.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

    private String username;
    private List<String> followers;
    private List<Message> messages;

    public User() {
        this.followers = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public User(String username, String message) {
        this.followers = new ArrayList<>();
        this.messages = new ArrayList<>();

        Message msg = new Message(username, message, new Date());

        this.username = username;
        this.messages.add(msg);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void addFollower(String follower) {
        followers.add(follower);
    }

    public List<String> getFollowers() {
        return followers;
    }

    public void setFollowers(List<String> followers) {
        this.followers = followers;
    }

    public void addMessage(String message) {
        Message msg = new Message(username, message, new Date());
        messages.add(msg);
    }

    public void addMessage(Message message) {
        Message msg = message;
        messages.add(msg);
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
