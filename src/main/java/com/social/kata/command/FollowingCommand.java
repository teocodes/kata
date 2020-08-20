package com.social.kata.command;

import com.social.kata.user.User;
import com.social.kata.user.UserRepo;
import com.social.kata.utils.Util;
import org.springframework.stereotype.Component;

@Component
public class FollowingCommand implements Command{

    private String[] parsedString;

    public FollowingCommand(String[] parsedString) {
        this.parsedString = parsedString;
    }

    @Override
    public void execCommand(UserRepo userRepo) {

        String username = Util.formatResult(parsedString, "FOLLOW").get(0);
        String follname = Util.formatResult(parsedString, "FOLLOW").get(1);

        User user = userRepo.get(username);
    //    User userToFollow = userRepo.get(follname);
     //   userRepo.get(username).addFollower(userToFollow); //add follower to principal user

        userRepo.addFollower(user, follname);

        System.out.println("> Ora "+username+" segue "+follname);
    }
}
