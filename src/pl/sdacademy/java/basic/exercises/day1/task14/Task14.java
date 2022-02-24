package pl.sdacademy.java.basic.exercises.day1.task14;

import java.util.Scanner;

public class Task14 {
    private static Scanner input;
    private static final double MIN_VALUE_OF_AMOUNT = 100.00;
    private static final double MAX_VALUE_OF_AMOUNT = 10_000.00;
    private static final int MIN_VALUE_OF_NUMBER_OF_INSTALLMENTS = 6;
    private static final int MAX_VALUE_OF_NUMBER_OF_INSTALLMENTS = 48;
    private static final double DEFAULT_VALUE_OF_MIN_AMOUNT = 1_000.00;
    private static final double DEFAULT_VALUE_OF_MAX_AMOUNT = 5_000.00;
    private static final int DEFAULT_VALUE_OF_MIN_NUMBER_OF_INSTALLMENTS = 18;
    private static final int DEFAULT_VALUE_OF_MAX_NUMBER_OF_INSTALLMENTS = 36;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        double amount = setAndVerifyAmount();
        int numberOfInstallments = setAndVerifyNumberOfInstallments();


    }
    private static double setAndVerifyAmount() {
        System.out.print("Please insert amount: ");
        double amount = input.nextDouble();
        if (amount < MIN_VALUE_OF_AMOUNT) {
            System.out.println("Amount is too low Default value 1000,00 was set");
            return DEFAULT_VALUE_OF_MIN_AMOUNT;
        }
        if (amount > MAX_VALUE_OF_AMOUNT) {
            System.out.println("Amount is too big Default value 5000,00 was set");
            return DEFAULT_VALUE_OF_MAX_AMOUNT;
        }
        return amount;
    }
    private static int setAndVerifyNumberOfInstallments() {
        System.out.println("Please insert number of installments: ");
        int numberOfInstallments = input.nextInt();
        if (numberOfInstallments < MIN_VALUE_OF_NUMBER_OF_INSTALLMENTS) {
            System.out.println("Number of installments is too low Default value 18 was set");
            return DEFAULT_VALUE_OF_MIN_NUMBER_OF_INSTALLMENTS;
        }
        if (numberOfInstallments > MAX_VALUE_OF_NUMBER_OF_INSTALLMENTS) {
            System.out.println("Number of installments is too big Default value 36 was set");
            return DEFAULT_VALUE_OF_MAX_NUMBER_OF_INSTALLMENTS;
        }
        return numberOfInstallments;
    }
    private static double calculationOfSingleInstallment() {
        return 0;
    }
}
