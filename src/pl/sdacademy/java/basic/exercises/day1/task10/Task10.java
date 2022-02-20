package pl.sdacademy.java.basic.exercises.day1.task10;

public class Task10 {

    public static void main(String[] args) {
    int number = 123;

    int resault = sumOfDigits(number);
        System.out.println(" Sum: " + resault);
    }
    private static int sumOfDigits(int number) {
        int sum = 0;
        if (number > 9) {
            while (number != 0) { // number = 123
                sum += number % 10; // sum = 0+3, number % 10 => 123 % 10 = 3
                number /= 10; // number / 10 => 123 /10 = 12
            }
        } else {
            sum = number;
        }
        return sum;
    }
}
