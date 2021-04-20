package chapter10;

import java.util.Arrays;
import java.util.Comparator;

public class Question10_3_SearchInRotatedArray {
    public static void main(String[] argv) {
        String[] array = new String[] {"abc", "ala", "cba", "skaro", "all", "laa", "oskar"};
        System.out.println("Original array: " + Arrays.toString(array));
        Arrays.sort(array, Comparator.comparing(Question10_3_SearchInRotatedArray::sortChars));
        System.out.println("Anagram sorted array: " + Arrays.toString(array));
    }

    public static String sortChars(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}
