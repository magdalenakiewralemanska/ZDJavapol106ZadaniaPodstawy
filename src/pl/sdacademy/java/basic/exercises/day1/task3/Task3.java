package pl.sdacademy.java.basic.exercises.day1.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert first digit: ");
        int x = scanner.nextInt();

        System.out.print("Please insert second digit: ");
        int y = scanner.nextInt();

    boolean compare = compareXAndY(x, y);
        System.out.println("If x is greater than y: " + compare);

    boolean multiplication = calcualtionXMultiplicate3(x, y);
        System.out.println("If x * 3 greater than y: " + multiplication);

    boolean point3 = methodForPointC(x, y);
        System.out.println("If y++ is smaller than ++x and --x is smaller than y++: " + point3);

    boolean point4 = evenNumber(x, y);
        System.out.println("If x * y is even: " + point4);
    }

    private static boolean compareXAndY(int x, int y) {
           return x > y;
        }

    private static boolean calcualtionXMultiplicate3(int x, int y) {
            return (x * 3) > y;
        }

    private static boolean methodForPointC(int x, int y){
            return (y++ < ++x) && (--x < y++);
        }

    private static boolean evenNumber(int x, int y){
           return (x * y) % 2 == 0;
    }
}
