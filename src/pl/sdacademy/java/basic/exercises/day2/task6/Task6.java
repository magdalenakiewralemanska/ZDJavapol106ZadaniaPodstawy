package pl.sdacademy.java.basic.exercises.day2.task6;

public class Task6 {

    public static void main(String[] args) {
        String input = "Ala ma kota";
        char character = 'a';
        System.out.println(numberOfIndex(input, character));
        System.out.println(numberOfIndex2(input, character));
    }

    private static int numberOfIndex (String input, char character){
        if (input != null && !input.isBlank()) {
        int index = input.indexOf(character);
        return index;
        }
        return -1;
    }

    private static int numberOfIndex2 (String input, char character){
        if (input != null && !input.isBlank()) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == character) {
                    return i;
                }
            }
        } return -1;
    }
}
