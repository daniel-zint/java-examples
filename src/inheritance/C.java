package inheritance;

public class C extends B {
    // a no-args constructor
    public C() {
        System.out.println("A new 'C' object is born!");
    }

    // an overloaded constructor that accepts a message
    public C(String message) {
        this();
        this.setMessage(message);
    }
}
