package com.social.kata.user;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserRepo {
    private List<User> userList;
    public UserRepo() {
        this.userList = new ArrayList<>();
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

    public void add(User user){
        int index = findUserPosition(user.getUsername());
        if(index != -1){
            userList.get(index).addMessage(user.getMessages().get(0));
        }
        else{
            userList.add(user);
        }
    }

    public void addFollower(User user, String follower){
        int index = findUserPosition(user.getUsername());
        userList.get(index).addFollower(follower.trim());
    }

    public User get(String username){
        User user = null;

        int index = findUserPosition(username);
        if(index != -1){
            user = userList.get(index);
        }

        return user;
    }

}
