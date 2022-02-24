package pl.sdacademy.java.basic.exercises.day2.task7;

import java.util.Scanner;

public class Task7 {
    private static Scanner input;
    private static final char SPACE_SIGN = ' ';
    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Input: ");
        String text = input.nextLine();
        System.out.println("Result: " + calculatePercentOfSpacesInString(text));

    }
    private static double calculatePercentOfSpacesInString(String text){
        double numberOfWhiteSigns = 0;

        for (int i = 0; i <text.length(); i++) {
            if (text.charAt(i) == SPACE_SIGN) {
                numberOfWhiteSigns++;
            }
        } return (numberOfWhiteSigns / text.length()) * 100;
    }
}
