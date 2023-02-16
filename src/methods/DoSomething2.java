package methods;

public class DoSomething2 {
    public static void main(String[] args) {
        doSomething2();
    }

    public static void doSomething1() {
        System.out.println("Running  doSomething1");
        // imagine some useful stuff happens in the middle here
        System.out.println("Exiting  doSomething1");
    }

    public static void doSomething2() {
        System.out.println("Begin doSommething2");
        doSomething1(); // call the method
        System.out.println("End doSomething2");
    }
}
