package ms_oa;

import java.util.Arrays;

public class LargestPositiveAndNegativeK {
    public static void main(String[] argv) {
        int[] array = new int[] {3, 2, -2, 5, -3};
        System.out.println(Arrays.toString(array) + " - Largest K: " + findLargestK(array));
        array = new int[] {1, 2, 3, -4};
        System.out.println(Arrays.toString(array) + " - Largest K: " + findLargestK(array));
    }

    private static int findLargestK(int[] array) {
        Arrays.sort(array);
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while(leftIndex <= rightIndex) {
            if(array[leftIndex] < 0 && Math.abs(array[leftIndex]) == array[rightIndex]) {
                return array[rightIndex];
            }

            if(Math.abs(array[leftIndex]) > Math.abs(array[rightIndex])) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }

        return 0;
    }
}
