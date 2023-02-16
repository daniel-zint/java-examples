package methods;

public class Overloading {
    public static void main(String[] args) {
        foo();
        foo("Hello");
        foo("Hello", true);

        System.out.println("getMax() = " + getMax(0, 42));
    }

    public static void foo() {
        System.out.println("foo()");
    }

    public static void foo(String bar) {
        System.out.println("foo(" + bar + ")");
    }

    public static void foo(String bar, boolean baz) {
        System.out.println("foo(" + bar + "," + baz + ")");
    }

    public static boolean isDouble(double x) {
        return true;
    }

    public static boolean isDouble(float x) {
        return false;
    }

    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }

    public static double getMax(double a, double b) {
        return a > b ? a : b;
    }

    // public static double getMax(int a, double b) {
    // return a > b ? a : b;
    // }
    //
    // public static double getMax(double a, int b) {
    // return a > b ? a : b;
    // }
}
