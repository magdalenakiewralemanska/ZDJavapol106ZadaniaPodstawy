package pl.sdacademy.java.basic.exercises.day2.task9;

import java.util.Scanner;

public class Task9 {
    private static final String STOP_TEXT= "Enough";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        int maxOfTextLength = 0;
        String longestWord = null;

        do {
            System.out.print("Please insert your text: ");
            text = scanner.nextLine();
            if (text.isBlank()) {
                System.out.println("No input");
            } else if(!STOP_TEXT.equals(text)) {
                if (maxOfTextLength < text.length()) {
                    longestWord = text;
                    maxOfTextLength = text.length();
                }
            }
        } while (!STOP_TEXT.equals(text));
        System.out.println("Result: " + longestWord);
    }
}
