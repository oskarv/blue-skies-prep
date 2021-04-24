package ms_oa;

import java.util.Arrays;

public class MaximumLengthOfConcatenatedStringWithUniqueCharacters {
    static int max = 0;
    public static void main(String[] argv) {
        String[] input = new String[] { "un","iq","ue" };
        maxConcatenatedUniqueLength(input, 0, new StringBuilder());
        System.out.println(Arrays.toString(input) + " - max: " + max);
        input = new String[] { "cha","r","act","ers" };
        max = 0;
        maxConcatenatedUniqueLength(input, 0, new StringBuilder());
        System.out.println(Arrays.toString(input) + " - max: " + max);
        input = new String[] { "abcdefghijklmnopqrstuvwxyz" };
        max = 0;
        maxConcatenatedUniqueLength(input, 0, new StringBuilder());
        System.out.println(Arrays.toString(input) + " - max: " + max);
    }

    private static void maxConcatenatedUniqueLength(String[] input, int index, StringBuilder result) {
        if(index == input.length) {
            max = Math.max(max, result.length());
            return;
        }
        String current = input[index];
        if(areAllCharsUnique(current, result.toString())) {
            result.append(current);
            maxConcatenatedUniqueLength(input, index + 1, result);
            result.setLength(result.length() - current.length());
        }
        maxConcatenatedUniqueLength(input, index + 1, result);
    }

    private static boolean areAllCharsUnique(String A, String B) {
        int[] count = new int[26];
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            count[c -'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 1) return false;
        }

        for (int i = 0; i < B.length(); i++) {
            char c = B.charAt(i);
            if (count[c -'a'] != 0) return false;
        }
        return true;
    }
}
