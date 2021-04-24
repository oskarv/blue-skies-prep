package ms_oa;

import java.util.Arrays;

public class JumpGame_1306 {
    public static void main(String[] argv) {
        int[] array = new int[] { 4, 2, 3, 0, 3, 1, 2 };
        int start = 5;
        System.out.println(Arrays.toString(array) + " - can jump to zero: " + canReach(array, start));
        start = 0;
        array = new int[] { 4, 2, 3, 0, 3, 1, 2 };
        System.out.println(Arrays.toString(array) + " - can jump to zero: " + canReach(array, start));
        start = 2;
        array = new int[] { 3,0,2,1,2 };
        System.out.println(Arrays.toString(array) + " - can jump to zero: " + canReach(array, start));
    }

    public static boolean canReach(int[] arr, int start) {
        if(start >= arr.length || start < 0 || arr[start] < 0) {
            return false;
        }

        int jump = arr[start];
        arr[start] = -1;
        if(jump == 0) {
            return true;
        }
        return canReach(arr, start + jump) || canReach(arr, start - jump);
    }
}
