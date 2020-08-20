package com.social.kata.console;

import com.social.kata.command.*;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
public class Parser {

    public String[] parse(Console cmdline) throws IOException {

       String[] str = cmdline.getConsoleLine().split(" ");

       return str;
    }

    public Command getCommandType(Console cmdline) throws IOException {

        String[] parsed = parse(cmdline);//cmdline.getConsoleLine().split(" ");

        String str = null;

        if(parsed.length >= 2)
            str = parsed[1];

        if(str!= null){
            switch (str){
                case "->":
                    return new PostingCommand(parsed);
                case "follows":
                    return new FollowingCommand(parsed);
                case "wall":
                    return new WallCommand(parsed);
            }
        }
        else
            return new ReadingCommand(parsed);

        return null;
    }
}
