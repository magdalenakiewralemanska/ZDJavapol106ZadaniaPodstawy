package pl.sdacademy.java.basic.exercises.day2.task2;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(isWordStartsWithPrefix("", "pro"));
        System.out.println(isWordEndsWithSuffix("", "nie"));

    }
    private static boolean isWordStartsWithPrefix(String input, String prefix) {
//        if (input != null) {
//            return input.startsWith(prefix);
//        }
//        else {
//            return false;
//        }
        // logika ? akcja gdy true : akcja gdy false
        // (oba argumenty muszą być tego samego typu np. Strin i String, albo dwa booleany)
//        boolean tmp = input != null ? input.startsWith(prefix) : false;
//        return tmp;
       return input != null ? input.startsWith(prefix) : false;
    }
    private static boolean isWordEndsWithSuffix(String input, String suffix) {
        return input != null ? input.endsWith(suffix) : false;
    }
}
