package com.social.kata.command;

import com.social.kata.user.Message;
import com.social.kata.user.User;
import com.social.kata.user.UserRepo;
import com.social.kata.utils.Util;
import org.springframework.stereotype.Component;

@Component
public class ReadingCommand implements Command{

    private String[] parsedString;

    public ReadingCommand(String[] parsedString) {
        this.parsedString = parsedString;
    }

    @Override
    public void execCommand(UserRepo userRepo) {

        String username = Util.formatResult(parsedString, "READ").get(0);

        User user = userRepo.get(username);

        for(Message msg : user.getMessages()){
            System.out.println("> "+msg.getUsername()+": "+msg.getMessage() +" ("+Util.timeDiff(msg.getSendDate())+")");
        }

    }
}
