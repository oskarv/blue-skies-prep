package chapter1;

import java.util.ArrayList;
import java.util.List;

public class Question1_8_ZeroMatrix {
    public static void main(String[] argv) {
        int[][] matrix = {{1, 2, 3}, {0, 5, 6}, {7, 8, 9}};
        System.out.println("Initial matrix:");
        printMatrix(matrix);
        System.out.println("Zero matrix:");
        printMatrix(createZeroMatrix(matrix));
    }

    private static int[][] createZeroMatrix(int[][] matrix) {
        List<Integer> zeroElementRows = new ArrayList<>();
        List<Integer> zeroElementColumns = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] == 0) {
                    zeroElementRows.add(i);
                    zeroElementColumns.add(j);
                }
            }
        }

        for(Integer index : zeroElementRows) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[index][i] = 0;
            }
        }

        for(Integer index : zeroElementColumns) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][index] = 0;
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
