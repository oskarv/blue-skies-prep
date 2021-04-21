package chapter8;

public class Page131_FibonacciNumbers {
    public static void main(String[] argv) {
        int fibonacci = 5; // 1, 1, 2, 3, 5
        System.out.println(fibonacci + "th fibonacci number is: - " + fibonacciNumber(fibonacci));
        fibonacci = 3;
        System.out.println(fibonacci + "th fibonacci number is: - " + fibonacciNumber(fibonacci));
        fibonacci = 10;
        System.out.println(fibonacci + "th fibonacci number is: - " + fibonacciNumber(fibonacci));
        fibonacci = 45;
        long start = System.currentTimeMillis();
        System.out.println(fibonacci + "th fibonacci number is: - " + fibonacciNumber(fibonacci));
        long end = System.currentTimeMillis();
        System.out.println("Execution time = " + ((end - start) / 1000) + " seconds");
    }

    private static int fibonacciNumber(int fibonacci) {
        if(fibonacci == 0) {
            return 0;
        }
        if(fibonacci == 1) {
            return 1;
        }
        return fibonacciNumber(fibonacci - 1) + fibonacciNumber(fibonacci - 2);
    }
}
