package chapter8;

import java.util.Arrays;

public class Question_8_11_Coins_WithMemoization {
    public static void main(String[] argv) {
        long start = System.currentTimeMillis();
        int cents = 65;
        int[] memoization = new int[cents + 1];
        Arrays.fill(memoization, -1);
        int result = countWays(cents, memoization);
        long end = System.currentTimeMillis();
        long seconds = (end - start) / 1000;
        System.out.println("Count ways for " + cents + " cents: " + result + " (Calculated in: " + seconds + " seconds)");
        cents = 1;
        memoization = new int[cents + 1];
        Arrays.fill(memoization, -1);
        System.out.println("Count ways for " + cents + " cents: " + countWays(cents, memoization));
        cents = 0;
        memoization = new int[cents + 1];
        Arrays.fill(memoization, -1);
        System.out.println("Count ways for " + cents + " cents: " + countWays(cents, memoization));
        cents = 25;
        memoization = new int[cents + 1];
        Arrays.fill(memoization, -1);
        System.out.println("Count ways for " + cents + " cents: " + countWays(cents, memoization));
    }

    public static int countWays(int cents, int[] memoization) {
        if(cents < 0) {
            return 0;
        }
        if(cents == 0) {
            return 1;
        }

        if(memoization[cents] > -1) {
            return memoization[cents];
        }

        memoization[cents] = countWays(cents - 25, memoization) + countWays(cents - 10, memoization)
                + countWays(cents - 5, memoization) + countWays(cents - 1, memoization);

        return memoization[cents];
    }
}
