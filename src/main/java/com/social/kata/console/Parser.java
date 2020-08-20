package com.social.kata.console;

import com.social.kata.command.Command;
import com.social.kata.command.PostingCommand;
import com.social.kata.command.ReadingCommand;
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

    public Command getCommandType(String cmdline) throws IOException {

        String[] parsed = cmdline.split(" ");

        String str = parsed[1];
        if(str!= null){
            switch (str){
                case "->":
                    return new PostingCommand(parsed);
                case "follows":
                    return new PostingCommand(parsed);
                case "wall":
                    return new PostingCommand(parsed);
            }
        }
        else
            return new ReadingCommand(parsed);

        return new PostingCommand(parsed);
    }
}
