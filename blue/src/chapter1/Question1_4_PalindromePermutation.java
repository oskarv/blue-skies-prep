package chapter1;

import java.util.HashMap;
import java.util.Map;

public class Question1_4_PalindromePermutation {

    public static void main(String[] argv) {
        String input = "Tact Coa";
        System.out.println("Palindrome Permutation for: '" + input + "' -> " + findPalindromePermutation(input));

        input = "oko";
        System.out.println("Palindrome Permutation for: '" + input + "' -> " + findPalindromePermutation(input));

        input = "println()";
        System.out.println("Palindrome Permutation for: '" + input + "' -> " + findPalindromePermutation(input));
    }

    private static boolean findPalindromePermutation(String input) {
        input = input.toLowerCase();
        Map<Character, Integer> inputCharMap = new HashMap<>();
        for(Character character : input.toCharArray()) {
            if(character.equals(' ')) {
                continue;
            }
            if(inputCharMap.containsKey(character)) {
                inputCharMap.put(character, inputCharMap.get(character) + 1);
            } else {
                inputCharMap.put(character, 1);
            }
        }

        int allowedSingleElements = 0;
        for(Integer element : inputCharMap.values()) {
            if(element % 2 != 0) {
                allowedSingleElements++;
                if(allowedSingleElements > 1) {
                    return false;
                }
            }
        }

        return true;
    }

}
