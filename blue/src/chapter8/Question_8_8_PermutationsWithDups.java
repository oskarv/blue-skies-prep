package chapter8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question_8_8_PermutationsWithDups {
    public static void main(String[] argv) {
        Map<String, String> duplicatesCheckingMap;
        String input = "abc";
        duplicatesCheckingMap = new HashMap<>();
        System.out.println(findAllPermutations(input, duplicatesCheckingMap));
        input = "aaa";
        duplicatesCheckingMap = new HashMap<>();
        System.out.println(findAllPermutations(input, duplicatesCheckingMap));
        input = "oskar";
        duplicatesCheckingMap = new HashMap<>();
        System.out.println(findAllPermutations(input, duplicatesCheckingMap));
    }

    public static List<String> findAllPermutations(String input, Map<String, String> duplicatesCheckingMap) {
        List<String> permutations = new ArrayList<>();

        if(input.length() == 0) {
            permutations.add("");
            return permutations;
        }

        char first = input.charAt(0);
        String reminder = input.substring(1);
        List<String> currentPermutation = findAllPermutations(reminder, duplicatesCheckingMap);
        for(String incompletePermutation : currentPermutation) {
            for(int i = 0; i <= incompletePermutation.length(); i++) {
                String beginning = incompletePermutation.substring(0, i);
                String ending = incompletePermutation.substring(i);
                String permutation = beginning + first + ending;
                if(!duplicatesCheckingMap.containsKey(permutation)) {
                    permutations.add(permutation);
                    duplicatesCheckingMap.put(permutation, permutation);
                }
            }
        }

        return permutations;
    }
}
