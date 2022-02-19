package pl.sdacademy.java.basic.exercises.day1.task2;

import java.util.Scanner;

public class Task2 {

    private static final float PI = 3.14f;
    public static void main(String[] args) {

        float diameter = getDiameter();
        float circumference = calculateOfCircleCircumference(diameter);
        System.out.println("Circumference Of A Circle: " + circumference);
        float area = calculateOfCircleArea(diameter);
        System.out.println("Area Of A Circle: " + area);

    }

    private static float getDiameter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert diameter: ");
        return scanner.nextFloat();
        }

    private static float calculateOfCircleArea(float diameter){
        float radius = diameter/2;
//        return PI * radius * radius;
        return (float) Math.PI * radius * radius;
    }

    private static float calculateOfCircleCircumference(float diameter) {
//        return PI * diameter;
        return (float) Math.PI * diameter;
    }
}
