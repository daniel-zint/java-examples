package methods;

public class MethodWithParameter {
    public static void main(String[] args) {
        int x = 0;
        doSomething(x);
        System.out.println("End main, x = " + x);
    }

    public static void doSomething(int x) {
        System.out.println("Begin doSomething1, x = " + x);
        x++; // increment x
        System.out.println("End doSomething1, x = " + x);
    }
}
