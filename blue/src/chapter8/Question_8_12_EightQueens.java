package chapter8;

import java.util.ArrayList;
import java.util.Arrays;

public class Question_8_12_EightQueens {
    public static final int GRID_SIZE = 8;
    public static void main(String[] argv) {
        int row = 0;
        Integer[] columns = new Integer[GRID_SIZE];
        ArrayList<Integer[]> result = new ArrayList<>();
        placeQueens(row, columns, result);
        result.forEach(array -> System.out.println(Arrays.toString(array)));
    }

    public static void placeQueens(int row, Integer[] columns, ArrayList<Integer[]> result) {
        if(row == GRID_SIZE) {
            result.add(columns.clone());
        } else {
            for(int column = 0; column < GRID_SIZE; column++) {
                if(isValid(columns, column, row)) {
                    columns[row] = column;
                    placeQueens(row + 1, columns, result);
                }
            }
        }
    }

    private static boolean isValid(Integer[] columns, int column, int row) {
        for(int currentRow = 0; currentRow < row; currentRow++) {
            Integer currentColumn = columns[currentRow];
            if(currentColumn == column) {
                return false;
            }

            int columnsDiff = Math.abs(column - currentColumn);
            int rowDiff = Math.abs(row - currentRow);
            if(columnsDiff == rowDiff) {
                return false;
            }
        }
        return true;
    }
}
