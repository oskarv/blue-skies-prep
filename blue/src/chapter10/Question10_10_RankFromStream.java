package chapter10;

public class Question10_10_RankFromStream {
    public static void main(String[] argv) {
        int[] stream = new int[] {5, 1, 4, 4, 5, 6, 7, 13, 3};
        int[] ranks = new int[100];
        consumeStream(stream, ranks);
        int number = 1;
        System.out.println("Calculate rank for '" + number + "' - " + getRankOfNumber(number, ranks));
        number = 3;
        System.out.println("Calculate rank for '" + number + "' - " + getRankOfNumber(number, ranks));
        number = 4;
        System.out.println("Calculate rank for '" + number + "' - " + getRankOfNumber(number, ranks));
        number = 13;
        System.out.println("Calculate rank for '" + number + "' - " + getRankOfNumber(number, ranks));
        number = 7;
        System.out.println("Calculate rank for '" + number + "' - " + getRankOfNumber(number, ranks));
    }

    private static int getRankOfNumber(int number, int[] ranks) {
        int result = 0;
        for(int i = 0; i < number; i++) {
            result += ranks[i];
        }
        if(ranks[number] > 1) {
            result += ranks[number] - 1;
        }
        return result;
    }

    private static void consumeStream(int[] stream, int[] ranks) {
        for(int element : stream) {
            ranks[element]++;
        }
    }
}