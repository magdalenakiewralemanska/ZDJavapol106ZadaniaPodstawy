package pl.sdacademy.java.basic.exercises.day2.task16;

import java.util.Arrays;

public class Task16 {

    public static void main(String[] args) {
        int[] array = new int[] {12, 7, 19};
        int[] input = new int[] {12, 7, 19, 30, 22};
        System.out.print("Input: " + Arrays.toString(array));
        System.out.println();
        int tmp = array[0];
        array[0] = array[2];
        array[2] = tmp;
        System.out.println("Result: " + Arrays.toString(array));

        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Result: " + Arrays.toString(reverseArray(input)));
    }
    private static int[] reverseArray (int[] input) {
        for (int i = 0; i < input.length/2; i++) {
            int reversePosition = (input.length - 1) - i;
            int tmp = input [i];
            input [i] = input [reversePosition];
            input[reversePosition] = tmp;
        } return input;
    }
}
