package com.social.kata;

import com.social.kata.console.Console;
import com.social.kata.console.Parser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class KataApplicationCmdRunner implements CommandLineRunner {

    @Autowired
    private Console console;

    @Autowired
    private Parser parser;

    @Override
    public void run(String...args) throws Exception {
        System.out.println("provala");
       // console.getConsoleLine();
        System.out.println(parser.parse(console)[0]);
    }


}