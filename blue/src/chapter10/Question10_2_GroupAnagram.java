package chapter10;

import java.util.Arrays;

public class Question10_2_GroupAnagram {
    public static void main(String[] argv) {
        String[] array = new String[] {"abc", "ala", "cba", "skaro", "all", "laa", "oskar"};
        System.out.println("Original array: " + Arrays.toString(array));
        Arrays.sort(array, (s1, s2) -> sortChars(s1).compareTo(sortChars(s2)));
        System.out.println("Anagram sorted array: " + Arrays.toString(array));
    }

    public static String sortChars(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}
