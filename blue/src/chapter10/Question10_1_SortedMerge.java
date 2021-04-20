package chapter10;

import java.util.Arrays;

public class Question10_1_SortedMerge {
    public static void main(String[] argv) {
        int[] arrayA = new int[8];
        for(int i = 0; i < 4; i++) {
            arrayA[i] = i + 1;
        }
        int[] arrayB = new int[] { 6, 7, 8, 9 };
        mergeArrays(arrayA, arrayB);
        System.out.println("Merged arrays: " + Arrays.toString(arrayA));
    }

    private static void mergeArrays(int[] arrayA, int[] arrayB) {
        int indexA = arrayA.length - 1 - 4;
        int indexB = arrayB.length - 1;
        int indexMerged = arrayA.length - 4 + arrayB.length - 1;

        while (indexB >= 0) {
            if(arrayA[indexA] > arrayB[indexB]) {
                arrayA[indexMerged] = arrayA[indexA];
                indexA--;
            } else {
                arrayA[indexMerged] = arrayB[indexB];
                indexB--;
            }
            indexMerged--;
        }

    }
}
