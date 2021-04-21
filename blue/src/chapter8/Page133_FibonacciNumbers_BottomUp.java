package chapter8;

public class Page133_FibonacciNumbers_BottomUp {
    public static void main(String[] argv) {
        int fibonacci = 5; // 1, 1, 2, 3, 5
        System.out.println(fibonacci + "th fibonacci number is: - " + fibonacciNumber(fibonacci));
        System.out.println("==========================================================================");
        fibonacci = 45;
        long start = System.currentTimeMillis();
        System.out.println(fibonacci + "th fibonacci number is: - " + fibonacciNumber(fibonacci));
        long end = System.currentTimeMillis();
        System.out.println("Execution time = " + ((end - start) / 1000) + " seconds");
        System.out.println("==========================================================================");
        fibonacci = 83;
        start = System.currentTimeMillis();
        System.out.println(fibonacci + "th fibonacci number is: - " + fibonacciNumber(fibonacci));
        end = System.currentTimeMillis();
        System.out.println("Execution time = " + ((end - start) / 1000) + " seconds");
        System.out.println("==========================================================================");
    }

    private static long fibonacciNumber(int fibonacci) {
        if(fibonacci == 0 || fibonacci == 1) {
            return fibonacci;
        }
        long oneBehind = 1;
        long twoBehind = 0;

        for(int i = 2; i < fibonacci; i++) {
            long current = oneBehind + twoBehind;
            twoBehind = oneBehind;
            oneBehind = current;
        }

        return oneBehind + twoBehind;
    }
}
