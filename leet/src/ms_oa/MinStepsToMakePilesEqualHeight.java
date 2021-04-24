package ms_oa;

import java.util.Arrays;

public class MinStepsToMakePilesEqualHeight {
    public static void main(String[] argv) {
        int[] array = new int[] {5, 2, 1};
        System.out.println(Arrays.toString(array) + " - num of steps: " + calculateMinStepsToMakePilesEqual(array));
        array = new int[] {1, 1, 2, 2, 2, 3, 3, 3, 4, 4};
        System.out.println(Arrays.toString(array) + " - num of steps: " + calculateMinStepsToMakePilesEqual(array));
    }

    public static int calculateMinStepsToMakePilesEqual(int[] array) {
        int result = 0, distinct = 0;
        Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            if(array[i] != array[i - 1]) {
                distinct++;
            }
            result += distinct;
        }
        return result;
    }
}
