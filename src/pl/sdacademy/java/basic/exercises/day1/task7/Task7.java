package pl.sdacademy.java.basic.exercises.day1.task7;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float firstDigit = scanner.nextFloat();
        float secondDigit = scanner.nextFloat();

        String decision;
        do {
            System.out.print("New calculation or 'Stop'");
            decision = scanner.nextLine();
        } while (!("Stop".equalsIgnoreCase(decision)));
    }

    private static void calculator(float firstDigit, float secondDigit, String operator) {
        switch (operator) {
            case "=":

                break;
            case "-":

                break;
            case "*":

                break;
            case "/":

                break;

        }
    }
}
