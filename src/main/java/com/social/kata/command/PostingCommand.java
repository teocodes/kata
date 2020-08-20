package com.social.kata.command;

import com.social.kata.user.User;
import com.social.kata.user.UserRepo;
import com.social.kata.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostingCommand implements Command{

    private String[] parsedString;

    public PostingCommand(String[] parsedString) {
        this.parsedString = parsedString;
    }

    @Override
    public void execCommand(UserRepo userRepo) {

        String username = Util.formatResult(parsedString, "POST").get(0);
        String message = Util.formatResult(parsedString, "POST").get(1);

        User user = new User(username, message);
        userRepo.add(user);
        System.out.println("PostingCommand 26" + username +" " + message);
        System.out.println("PostingCommand 27" + userRepo.get(username).getMessages().toString());
    }
}
