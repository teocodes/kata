package com.social.kata.user;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private List<String> followers;
    private List<String> messages;

    public User() {
        this.followers = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public User(String username, String message) {
        this.followers = new ArrayList<>();
        this.messages = new ArrayList<>();

        this.username = username;
        this.messages.add(message);
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
        messages.add(message);
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
