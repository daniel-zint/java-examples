package recursion;

public class Sudoku {
    public static void main(String[] args) {
        int[][] field = {
                { 7, 0, 0, 2, 8, 5, 3, 1, 9 },
                { 8, 1, 0, 0, 4, 0, 0, 0, 2 },
                { 9, 2, 3, 0, 7, 0, 0, 0, 0 },
                { 0, 0, 2, 1, 0, 7, 8, 0, 0 },
                { 3, 0, 1, 0, 5, 4, 2, 9, 6 },
                { 0, 9, 8, 3, 0, 2, 0, 0, 1 },
                { 5, 0, 6, 0, 0, 9, 1, 8, 0 },
                { 0, 0, 7, 0, 1, 0, 9, 0, 0 },
                { 0, 4, 9, 0, 3, 0, 6, 0, 5 }
        };

        displayField(field);

        System.out.println("Generate solution...");
        placeDigit(field);
    }

    public static void displayField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            if (i % 3 == 0) {
                System.out.println("-------------");
            }
            int[] row = field[i];

            for (int j = 0; j < row.length; j++) {
                if (j % 3 == 0) {
                    System.out.print("|");
                }
                if (row[j] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(row[j]);
                }
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }

    public static boolean isDigitValid(int digit, int row, int col, int[][] field) {
        // check row
        for (int i = 0; i < 9; i++) {
            if (field[row][i] == digit) {
                return false;
            }
        }
        // check col
        for (int i = 0; i < 9; i++) {
            if (field[i][col] == digit) {
                return false;
            }
        }

        // check 3x3 block
        int blockRow = (row / 3) * 3;
        int blockCol = (col / 3) * 3;

        for (int i = blockRow; i < blockRow + 3; i++) {
            for (int j = blockCol; j < blockCol + 3; j++) {
                if (field[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void placeDigit(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            int[] row = field[i];
            for (int j = 0; j < row.length; j++) {
                if (field[i][j] == 0) {
                    for (int digit = 1; digit < 10; digit++) {
                        if (isDigitValid(digit, i, j, field)) {
                            field[i][j] = digit;
                            placeDigit(field);
                            // if the code arrives here, the solution was not found --> reset value
                            field[i][j] = 0;
                        }
                    }
                    return;
                }
            }
        }

        displayField(field);
        System.out.println("Searching for other solutions...");
        return;
    }

}
