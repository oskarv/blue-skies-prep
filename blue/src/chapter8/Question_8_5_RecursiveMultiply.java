package chapter8;

public class Question_8_5_RecursiveMultiply {
    public static void main(String[] argv) {
        int num1 = 10;
        int num2 = 5;
        int[] multiplied = new int[1];
        System.out.println(num1 + " * " + num2 + " = " + recursiveMultiply(num1, num2, multiplied));
    }

    private static int recursiveMultiply(int num1, int num2, int[] multiplied) {
        if(num2 == 0) {
            return multiplied[0];
        }
        multiplied[0] += num1;
        return recursiveMultiply(num1, num2 - 1, multiplied);
    }
}
