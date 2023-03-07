package multi_dim_arrays;

public class TwoDimExample {
    public static void main(String[] args) {
        int[][] numbers = {
                { 10, 9, 8 },
                { 1, 2, 3 },
                { 6, 5, 4 },
        };

        // System.out.println(Arrays.deepToString(numbers));
        DeepPrintArray.print(numbers);

        // modify value
        numbers[1][2] = 42;
        System.out.println("After modification:");
        DeepPrintArray.print(numbers);

        // replace row
        int[] newRow = { 13, 12, 11 };
        numbers[2] = newRow;
        System.out.println("After replacing row:");
        DeepPrintArray.print(numbers);
    }
}
