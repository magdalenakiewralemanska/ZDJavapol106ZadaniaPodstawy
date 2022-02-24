package pl.sdacademy.java.basic.exercises.day2.task10;

import java.util.Scanner;

public class Task10 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("How many words would you like insert? ");
        int numberOfWords = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Result: " + newWordFromEndsLetters(numberOfWords));
    }

    private static String newWordFromEndsLetters (int numberOfWords) {
            StringBuilder result = new StringBuilder();
            for (;numberOfWords > 0; numberOfWords--) {
                String word = scanner.nextLine();
                result.append(word.charAt(word.length() - 1));
            } return result.toString();
        }
}
