package pl.sdacademy.java.basic.exercises.day1.task11;

import java.util.Random;
import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Random random = new Random();
        int randomComputerNumber = random.nextInt(0, 100);
        int digit = 0;
        toMuchToLowGame(randomComputerNumber, digit);
    }

    private static int toMuchToLowGame (int randomComputerNumber, int digit) {
        do { Scanner scanner = new Scanner(System.in);
            System.out.print("Please insert digit: ");
            digit = scanner.nextInt();
            if (digit > randomComputerNumber) {
                System.out.println("Too much");
            }
            else if (digit < randomComputerNumber) {
                System.out.println("Not enough");
            }
        } while (digit != randomComputerNumber);
        System.out.println("Bingo!");
        return digit;
    }
}
