package ms_oa;

import java.util.Arrays;

public class FindNUniqueIntegerSumUpToZero_1304 {
    public static void main(String[] argv) {
        System.out.println(Arrays.toString(sumZero(5)));
        System.out.println(Arrays.toString(sumZero(10)));
    }

    public static int[] sumZero(int n) {
        if(n == 0 || n == 1) {
            return new int[] {0};
        }
        int[] result = new int[n];
        int index = 0;
        boolean isOdd = n % 2 == 1;
        for(int i = 1; i <= n/2; i++) {
            result[index] = -1 * i;
            index++;
        }
        for(int i = 1; i <= n/2; i++) {
            result[index] = i;
            index++;
        }
        if(isOdd) {
            result[index] = 0;
        }

        return result;
    }
}
