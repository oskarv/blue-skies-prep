package chapter8;

import java.util.ArrayList;
import java.util.List;

public class Question_8_7_PermutationsWithoutDups {
    public static void main(String[] argv) {
        String input = "abc";
        //1 a
        //2 ab, ba
        //3 abc, bac, bca, acb, cab, cba
        // abc , acb, bac, bca, cab, cba
        System.out.println(findAllPermutations(input));
        input = "oskar";
        System.out.println(findAllPermutations(input));
    }

    public static List<String> findAllPermutations(String input) {
        ArrayList<String> permutations = new ArrayList<>();
        if(input.length() == 0) {
            permutations.add("");
            return permutations;
        }

        char first = input.charAt(0);
        String remainder = input.substring(1);
        List<String> currentIteration = findAllPermutations(remainder);
        for(String word : currentIteration) {
            for(int i = 0; i <= word.length(); i++) {
                String start = word.substring(0, i);
                String end = word.substring(i);
                permutations.add(start + first + end);
            }
        }

        return permutations;
    }
}
