package pl.sdacademy.java.basic.exercises.day2.task13;

import java.util.Arrays;

public class Task13 {

    public static void main(String[] args) {
        int[] inputs = {12, 7, 19};

        for(int element : inputs) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(inputs));

        System.out.println("Min value: " + getMinValue(inputs));
        System.out.println("Max value: " + getMaxValue(inputs));
        System.out.println("Sum: " + sum(inputs));
    }

    private static int getMinValue(int[] inputs) {

            int minValue = inputs[0];
            for (int i = 1; i < inputs.length; i++) {
                if (inputs[i] < minValue) {
                    minValue = inputs[i];
                }
            }


            for (int i : inputs) {
                if (i < minValue) {
                    minValue = i;
                }
            }
            return minValue;
        }

    private static int getMaxValue(int[] inputs) {
        int maxValue = inputs[0];
        for (int i : inputs) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    private static int sum(int[] inputs) {
        int sum = 0;
        for (int element : inputs) {
            sum += element;
        } return sum;
    }
}
