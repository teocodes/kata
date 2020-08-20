package com.social.kata.command;

import com.social.kata.user.Message;
import com.social.kata.user.User;
import com.social.kata.user.UserRepo;
import com.social.kata.utils.Util;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WallCommand implements Command{

    private String[] parsedString;

    public WallCommand(String[] parsedString) {
        this.parsedString = parsedString;
    }

    @Override
    public void execCommand(UserRepo userRepo) {

        String username = Util.formatResult(parsedString, "WALL").get(0);

        User user = userRepo.get(username);

        List<Message> wall = new ArrayList<>(user.getMessages());

        if(user.getFollowers().size()>=1){
            for(String follower : user.getFollowers()){
                User u = userRepo.get(follower);
                wall.addAll(u.getMessages());
            }
        }

        wall.sort(((o1,o2) -> -o1.getSendDate().compareTo(o2.getSendDate())));

        System.out.println("> "+username +" wall");
        for(Message msg : wall){
            System.out.println("> "+msg.getUsername()+": "+msg.getMessage() +" ("+Util.timeDiff(msg.getSendDate())+")");
        }
    }
}
