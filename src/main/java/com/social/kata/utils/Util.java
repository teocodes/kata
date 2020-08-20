package com.social.kata.utils;

import java.util.ArrayList;
import java.util.Date;
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
            formattedString += result[i] +" ";
        }
        if(!formattedString.isEmpty())
            formatted.add(formattedString); //message

        return formatted;
    }

    public static String timeDiff(Date messageDate) {

        long timeDiffMilliseconds = new Date().getTime() - messageDate.getTime();

        long diffSeconds = timeDiffMilliseconds / 1000;
        long diffMinutes = timeDiffMilliseconds / (60 * 1000);
        long diffHours = timeDiffMilliseconds / (60 * 60 * 1000);
        long diffDays = timeDiffMilliseconds / (60 * 60 * 1000 * 24);
        long diffWeeks = timeDiffMilliseconds / (60 * 60 * 1000 * 24 * 7);
        long diffMonths = (long) (timeDiffMilliseconds / (60 * 60 * 1000 * 24 * 30.41666666));
        long diffYears = timeDiffMilliseconds / ((long)60 * 60 * 1000 * 24 * 365);

        if (diffSeconds < 1) {
            return "meno di un secondo fa";
        } else if (diffMinutes < 1) {
            return diffSeconds + " secondi fa";
        } else if (diffHours < 1) {
            return diffMinutes + " minuti fa";
        } else if (diffDays < 1) {
            return diffHours + " ore fa";
        } else if (diffWeeks < 1) {
            return diffDays + " giorni fa";
        } else if (diffMonths < 1) {
            return diffWeeks + " settimane fa";
        } else if (diffYears < 1) {
            return diffMonths + " mesi fa";
        } else {
            return diffYears + " anni fa";
        }
    }
}
