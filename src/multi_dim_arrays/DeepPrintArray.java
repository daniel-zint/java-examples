package multi_dim_arrays;

import java.util.Arrays;

public class DeepPrintArray {
    public static void print(int[][] array) {
        System.out.println("[");
        for (int[] row : array) {
            System.out.println("  " + Arrays.toString(row));
        }
        System.out.println("]");
    }

    public static void print(int[][][] array) {
        System.out.println("[");
        for (int[][] row : array) {
            System.out.println("  [");
            for (int[] col : row) {
                System.out.println("    " + Arrays.toString(col));
            }
            System.out.println("  ]");
        }
        System.out.println("]");
    }

    public static void print(String[][] array) {
        System.out.println("[");
        for (String[] row : array) {
            System.out.println("  " + Arrays.toString(row));
        }
        System.out.println("]");
    }

    public static void print(String[][][] array) {
        System.out.println("[");
        for (String[][] row : array) {
            System.out.println("  [");
            for (String[] col : row) {
                System.out.println("    " + Arrays.toString(col));
            }
            System.out.println("  ]");
        }
        System.out.println("]");
    }

}
