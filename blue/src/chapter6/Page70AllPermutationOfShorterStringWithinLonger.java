package chapter6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a shorter string s and a bigger string b design an algorithm to find all permutations of the
 * shorter string within the longer one. Print the location of each permutation.
 * Example:
 *  s: abbc
 *  b: cbabadcbbabbcbabaabccbabc
 */
public class Page70AllPermutationOfShorterStringWithinLonger {

    public static void main(String[] arv) {
        String s = "abbc";
        String b = "cbabadcbbabbcbabaabccbabc";
        System.out.println("Number of permutations is: " + calculateNumberOfPermutations(s, b));
    }

    private static int calculateNumberOfPermutations(String s, String b) {
        int result = 0;
        Map<Integer, Character> sMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            sMap.put(i, s.charAt(i));
        }

        Map<Integer, Character> bSubsetMap = new HashMap<>();
        for(int i = 0; i < b.length(); i++) {
            if(bSubsetMap.size() != s.length()) {
                bSubsetMap.put(i, b.charAt(i));
            } else {
                if(areCharacterMapsEqual(sMap, bSubsetMap)) {
                    System.out.println("Found permutation: " + bSubsetMap.values() + " at index: " + (i - sMap.size()));
                    result += 1;
                }
                bSubsetMap.remove(i - sMap.size());
                bSubsetMap.put(i, b.charAt(i));
            }
        }

        if(areCharacterMapsEqual(sMap, bSubsetMap)) {
            System.out.println("Found permutation: " + bSubsetMap.values() + " at index: " + (b.length() - sMap.size()));
            result += 1;
        }

        return result;
    }

    private static boolean areCharacterMapsEqual(Map<Integer, Character> sMap, Map<Integer, Character> bSubsetMap) {
        Collection<Character> sMapValues = new ArrayList<>(sMap.values());
        Collection<Character> bMapValues = new ArrayList<>(bSubsetMap.values());
        for(Character character : sMapValues) {
            if(bMapValues.contains(character)) {
                bMapValues.remove(character);
            } else {
                return false;
            }
        }
        return true;
    }
}
