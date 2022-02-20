package pl.sdacademy.java.basic.exercises.day2.task5;

public class Task5 {

    public static void main(String[] args) {
        String input = "Ala ma kota";
        char searchedCharacter = 'a';
        System.out.println("Input: " + input);
        System.out.println("Searched Character: " + searchedCharacter);
        System.out.println("Resault: " + quantityOfChar(input, searchedCharacter));
    }
    private static int quantityOfChar (String input, char searchedCharacter) {
        if (input != null && !input.isBlank()){
        int quantity = 0;
        for (int i =0; i <input.length(); i++) {
            if (input.charAt(i) == searchedCharacter) {
                quantity++;
            }
        } return quantity;
    } else {
        return 0;
        }
    }
}
