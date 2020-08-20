package com.social.kata.command;

import com.social.kata.user.User;
import com.social.kata.user.UserRepo;
import com.social.kata.utils.Util;
import org.springframework.stereotype.Component;

@Component
public class WallCommand implements Command{

    private String[] parsedString;

    public WallCommand(String[] parsedString) {
        this.parsedString = parsedString;
    }

    @Override
    public void execCommand(UserRepo userRepo) {

        String username = Util.formatResult(parsedString, "POST").get(0);
       // String message = Util.formatResult(parsedString, "POST").get(1);

        User user = userRepo.get(username);


     //   System.out.println("PostingCommand 26" + username +" " + message);
        System.out.println("PostingCommand 27" + userRepo.get(username).getMessages().toString());
    }
}
