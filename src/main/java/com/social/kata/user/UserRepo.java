package com.social.kata.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepo {
    private List<User> userList;

    public UserRepo() {
        this.userList = new ArrayList<>();
    }

    public void add(String user, String message){
        int index = findUserPosition(user);
        if(index != -1){
            userList.get(index).addMessage(message);
        }
        else{
            User u = new User();
            u.setUsername(user);
            u.addMessage(message);
        }
    }

    private Integer findUserPosition(String username){
        int index = 0;
        int found = -1;

        for(User user : userList){
            if(user.getUsername().equals(username))
                found = index;
            index++;
        }

        return found;
    }


}
