package chapter8;

public class Page133_FibonacciNumbers_TopDownMemoization {
    public static void main(String[] argv) {
        int fibonacci = 5; // 1, 1, 2, 3, 5
        long[] memoization = new long[fibonacci + 1];
        System.out.println(fibonacci + "th fibonacci number is: - " + fibonacciNumber(fibonacci, memoization));
        System.out.println("==========================================================================");
        fibonacci = 45;
        memoization = new long[fibonacci + 1];
        long start = System.currentTimeMillis();
        System.out.println(fibonacci + "th fibonacci number is: - " + fibonacciNumber(fibonacci, memoization));
        long end = System.currentTimeMillis();
        System.out.println("Execution time = " + ((end - start) / 1000) + " seconds");
        System.out.println("==========================================================================");
        fibonacci = 83;
        memoization = new long[fibonacci + 1];
        start = System.currentTimeMillis();
        System.out.println(fibonacci + "th fibonacci number is: - " + fibonacciNumber(fibonacci, memoization));
        end = System.currentTimeMillis();
        System.out.println("Execution time = " + ((end - start) / 1000) + " seconds");
        System.out.println("==========================================================================");
    }

    private static long fibonacciNumber(int fibonacci, long[] memoization) {
        if(fibonacci == 0 || fibonacci == 1) {
            return fibonacci;
        }

        if(memoization[fibonacci] == 0) {
            memoization[fibonacci] = fibonacciNumber(fibonacci - 2, memoization)
                    + fibonacciNumber(fibonacci - 1, memoization);
        }
        return memoization[fibonacci];
    }
}
