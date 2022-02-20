package pl.sdacademy.java.basic.exercises.day2.Task11;

public class Task11 {

    public static void main(String[] args) {
        String input = "kajak";
        System.out.println("Input: " + input);
        System.out.println("Result: " + ifPalindrome(input));

        System.out.println();

        input = "sda";
        System.out.println("Input: " + input);
        System.out.println("Result: " + ifPalindrome(input));
    }
    private static boolean ifPalindrome (String input) {
        if (input != null && !input.isBlank()) {
        String sbAfterReverse = new StringBuilder(input).reverse().toString();
        return input.equals(sbAfterReverse);
         }
        return false;
    }
}
