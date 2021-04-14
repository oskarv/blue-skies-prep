package chapter1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question1_2_CheckPermutation {

    public static void main(String[] argv) {
        String string1 = "qwerty";
        String string2 = "ytrewq";
        System.out.println("Check permutation for {" + string1 + ", " + string2 + "} - " + isPermutation(string1, string2));

        string1 = "Oskar Vat";
        string2 = "Vat Osk  ";
        System.out.println("Check permutation for {" + string1 + ", " + string2 + "} - " + isPermutation(string1, string2));
    }

    private static boolean isPermutation(String string1, String string2) {
        if(string1.length() != string2.length()) {
            return false;
        }
        Map<Character, Integer> charMap = new HashMap<>();
        for(Character character : string1.toCharArray()) {
            if(charMap.containsKey(character)) {
                charMap.put(character, charMap.get(character) + 1);
            } else {
                charMap.put(character, 1);
            }
        }

        for(Character character : string2.toCharArray()) {
            if(charMap.containsKey(character)) {
                if(charMap.get(character) - 1 < 0) {
                    return false;
                }
                charMap.put(character, charMap.get(character) - 1);
            } else {
                return false;
            }
        }

        List<Integer> nonZeroElements = charMap.values().stream().filter(e -> e != 0).collect(Collectors.toList());
        return nonZeroElements.size() == 0;
    }
}
