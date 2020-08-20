package com.social.kata.utils;

import com.social.kata.command.Command;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static List<String> formatResult(String[] result, String type){
        List<String> formatted = new ArrayList<>();
        formatted.add(result[0]); //username

        int index = 0;
        String formattedString = "";

        switch (type){
            case "POST": case "FOLLOW":
                index = 2;
                break;
            case "READ":case "WALL":
                index = result.length;
                break;
        }

        for(int i=index;i<result.length;i++){
            formattedString += result[i];
        }
        if(!formattedString.isEmpty())
            formatted.add(formattedString); //message

   //     System.out.println("arriva "+ formattedString);

        return formatted;
    }

}
