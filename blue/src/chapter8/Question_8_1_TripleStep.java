package chapter8;

public class Question_8_1_TripleStep {
    public static void main(String[] argv) {
        int steps = 3;
        System.out.println(countWays(steps));
    }

    public static int countWays(int n) {
        if(n < 0) {
            return 0;
        }
        if(n == 0) {
            return 1;
        }

        return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
    }
}
