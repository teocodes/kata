package com.social.kata.console;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
public class Console {

    private BufferedReader buffer;

    public Console() {
        buffer = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getConsoleLine() throws IOException {
        return buffer.readLine();
    }

    public void sendToConsole(String toSend){
        System.out.println(toSend);
    }
}
