package exception_handling;

public class Main {
    public static void main(String[] args) {
        arrayOutOfBoundsException();
        // checkNumber(0);
    }

    public static void arrayOutOfBoundsException() {
        int[] arr = new int[2];

        try {
            System.out.println(arr[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void checkNumber(int i) throws NumberFortyTwoException {
        if (i == 42) {
            throw new NumberFortyTwoException();
        }
    }
}
