package com.social.kata.console;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Arrays;

@Component
public class Parser {
    public String[] parse(Console cmdline) throws IOException {

        return Arrays.stream(cmdline.getConsoleLine().split(" "))
                .toArray(String[]::new);
    }


}
