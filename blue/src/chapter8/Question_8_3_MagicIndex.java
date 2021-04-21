package chapter8;

import java.util.Arrays;

public class Question_8_3_MagicIndex {
    public static void main(String[] argv) {
        int[] array = new int[] { -40, -20, -1, 1, 2, 3, 5, 7, 9, 12, 13 };
        int index = findMagicIndex(array, 0, array.length - 1);
        System.out.println("Magic index for: " + Arrays.toString(array) + " is: " + index);
    }

    private static int findMagicIndex(int[] array, int start, int end) {
        if(start > end) {
            return -1;
        }
        int middle = (start + end) / 2;
        if(array[middle] == middle) {
            return middle;
        } else if(array[middle] > middle) {
            return findMagicIndex(array, start, middle - 1);
        } else {
            return findMagicIndex(array, middle + 1, end);
        }
    }
}
