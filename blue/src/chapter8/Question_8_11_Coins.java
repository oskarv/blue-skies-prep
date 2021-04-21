package chapter8;

public class Question_8_11_Coins {
    public static void main(String[] argv) {
        long start = System.currentTimeMillis();
        int cents = 65;
        int result = countWays(cents);
        long end = System.currentTimeMillis();
        long seconds = (end - start) / 1000;
        System.out.println("Count ways for " + cents + " cents: " + result + " (Calculated in: " + seconds + " seconds)");
        cents = 1;
        System.out.println("Count ways for " + cents + " cents: " + countWays(cents));
        cents = 0;
        System.out.println("Count ways for " + cents + " cents: " + countWays(cents));
        cents = 25;
        System.out.println("Count ways for " + cents + " cents: " + countWays(cents));
    }

    public static int countWays(int cents) {
        if(cents < 0) {
            return 0;
        }
        if(cents == 0) {
            return 1;
        }

        return countWays(cents - 25) + countWays(cents - 10)
                + countWays(cents - 5) + countWays(cents - 1);
    }
}
