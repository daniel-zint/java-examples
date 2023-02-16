package methods;

public class MethodWithReturn {
    public static void main(String[] args) {
        int x = 0;
        x = addOne(x);
        System.out.println("End main, x = " + x);
    }

    public static int addOne(int x) {
        System.out.println("Begin addOne, x = " + x);
        x++; // increment x
        System.out.println("End addOne, x = " + x);
        return x;
    }
}
