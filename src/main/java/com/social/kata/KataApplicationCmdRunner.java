package com.social.kata;

import com.social.kata.command.Command;
import com.social.kata.console.Console;
import com.social.kata.console.Parser;
import com.social.kata.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class KataApplicationCmdRunner implements CommandLineRunner {

    @Autowired
    private Console console;

    @Autowired
    private Parser parser;

    @Autowired
    private UserRepo userRepo;

    @Override
    public void run(String...args) throws Exception {

        while(true){
            System.out.print("> ");

            Command cmd = parser.getCommandType(console);
            cmd.execCommand(userRepo);
        }

    }

}