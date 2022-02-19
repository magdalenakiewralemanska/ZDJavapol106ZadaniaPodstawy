package pl.sdacademy.java.basic.exercises.day1.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

    printMultiplicationTable(6, 2, 5);
    }

    private static void printMultiplicationTable (int multiplier, int multiplicandMin, int multiplicandMax) {
//        for (; multiplicandMin<= multiplicandMax;multiplicandMin++) {
//            int resault = multiplier * multiplicandMin;
//            System.out.println(multiplier + " * " + multiplicandMin + " = " + resault);
//        }
        while (multiplicandMin <= multiplicandMax) {
            int resault = multiplier * multiplicandMin;
            System.out.println(multiplier + " * " + multiplicandMin + " = " + resault);
            multiplicandMin++;
        }
    }
}
