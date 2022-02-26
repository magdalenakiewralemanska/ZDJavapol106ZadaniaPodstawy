package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    private static final String EMAIL_REGEX = "[a-zA-Z0-9_.-]+\\@[a-zA-Z]+(\\.[a-zA-Z]+)?";
    public static void main(String[] args) {
        String emailAddress = "sda@com.pl";
        System.out.println("If email address " + emailAddress + " has correct format: " + isCorrectEmailFormat(emailAddress));

    }
    private static boolean isCorrectEmailFormat (String emailAddress) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
//        Matcher matcher = pattern.matcher(emailAddress);
//        return matcher.matches();
        return pattern.matcher(emailAddress).matches();
    }
}
