package ms_oa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumDeletionsToMakeCharacterFrequenciesUnique_1647 {
    public static void main(String[] argv) {
        System.out.println(minDeletions("bbcebab"));
    }

    public static int minDeletions(String s) {
        int result = 0;
        Map<Character, Integer> charMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            Character current = s.charAt(i);
            charMap.put(current, charMap.getOrDefault(current, 0) + 1);
        }

        Set<Integer> frequencySet = new HashSet<>();
        for(Map.Entry<Character, Integer> entry : charMap.entrySet()){
            int currentFrequency = entry.getValue();
            while(frequencySet.contains(currentFrequency)) {
                result++;
                currentFrequency--;
            }
            if(currentFrequency != 0) {
                frequencySet.add(currentFrequency);
            }
        }

        return result;
    }
}
