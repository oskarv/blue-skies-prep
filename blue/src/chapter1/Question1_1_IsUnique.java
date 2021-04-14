package chapter1;

import java.util.HashSet;
import java.util.Set;

public class Question1_1_IsUnique {

    public static void main(String[] argv) {
        String input = "qwerty";
        System.out.println("Is '" + input + "' unique: " + doesStringHaveUniqueCharacters(input));

        input = "Oskar Vat";
        System.out.println("Is '" + input + "' unique: " + doesStringHaveUniqueCharacters(input));
    }

    private static boolean doesStringHaveUniqueCharacters(String input) {
        Set<Character> inputCharactersSet = new HashSet<>();
        for (Character character : input.toCharArray()) {
            inputCharactersSet.add(character);
        }

        return inputCharactersSet.size() == input.length();
    }
}
