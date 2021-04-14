package chapter0;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of distinct integer values, count the number of pairs that have difference K.
 * Example: {1, 7, 5, 9, 2, 12, 3}, K = 2;
 * -> output: 4
 *              //// (1, 3), (3, 5), (5, 7), (7, 9)
 */
public class Page67FindAllPairsWithKDifference {

    public static void main(String[] argv) {
        int[] inputArray = new int[] { 1, 7, 5, 9, 2, 12, 3 };
        int k = 2;
        System.out.println("Number of pairs with K diff: " + calculateNumOfPairsWithKDiff(inputArray, k));
    }

    private static int calculateNumOfPairsWithKDiff(int[] inputArray, int k) {
        int result = 0;
        Map<Integer, Integer> mapOfInputElements = new HashMap<>();
        for(int element : inputArray) {
            mapOfInputElements.put(element, element);
        }

        for(int element : inputArray) {
            if(mapOfInputElements.containsKey(element + k)) {
                System.out.print(" {" + element + ", " + (element + k) + "} ");
                result += 1;
            }
        }
        System.out.print("\r\n");
        return result;
    }
}
