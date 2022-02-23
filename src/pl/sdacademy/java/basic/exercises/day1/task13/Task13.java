package pl.sdacademy.java.basic.exercises.day1.task13;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        int digit = 0;
        int sum = 0;
        int countsOfNumbers = 0;
        int countsOfPositiveNumbers = 0;
        float average;

            do {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Please insert digit: ");
                digit = scanner.nextInt();
                sum += digit;
                countsOfNumbers++;
                if (digit > 0){
                    countsOfPositiveNumbers++;
                }
            } while (digit != 0);

        System.out.println("Total Number Of Digits: " + --countsOfNumbers);
        System.out.println("Total Number Of Positive Digits: " + countsOfPositiveNumbers);
        average = (float) sum / countsOfNumbers;
        System.out.println("Arithmetic Average: " + average);
    }
}
