package methods;

public class TryCatch {
    public static void main(String[] args) {
        countToN(-1);

        // try {
        // countToN(-1);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        System.out.println("I am here.");
    }

    public static void countToN(int n) {
        if (n < 1) {
            System.err.println("Positive value expected: n = " + n);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    // public static void countToN(int n) {
    // if (n < 1) {
    // throw new ArithmeticException("Positive value expected: n = " + n);
    // }
    // for (int i = 0; i < n; i++) {
    // System.out.println(i);
    // }
    // }
}
