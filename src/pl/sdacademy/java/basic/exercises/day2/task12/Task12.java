package pl.sdacademy.java.basic.exercises.day2.task12;

import java.util.Scanner;

public class Task12 {
    private static final int LOW_A_IN_ASCII = 97;
    private static final int LOW_Z_IN_ASCII = 122;
    private static final int NUMBER_OF_LOW_LETTERS = 26;
    private static final int SIGN_OF_SPACE_IN_ASCII = 32;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert your text: ");
        String text = scanner.nextLine();
        System.out.print("Please insert shift: ");
        int shift = scanner.nextInt();
        System.out.println("Encrypted text: " + encryptedText(text, shift));
    }

    private static String encryptedText(String text, int shift) {
        StringBuilder encryptedTextSb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= LOW_A_IN_ASCII && text.charAt(i) <= LOW_Z_IN_ASCII) {
                char c = (char)(((text.charAt(i) - (LOW_A_IN_ASCII - shift)) % NUMBER_OF_LOW_LETTERS) + LOW_A_IN_ASCII);
                encryptedTextSb.append(c);
            } else if (text.charAt(i) == SIGN_OF_SPACE_IN_ASCII) {
                encryptedTextSb.append(text.charAt(i));
            }
        }
        return encryptedTextSb.toString();
    }
}
