package inheritance;

public class C extends B {
    private String message = "C message";

    // a no-args constructor
    public C() {
        System.out.println("A new 'C' object is born!");
    }

    // an overloaded constructor that accepts a message
    public C(String message) {
        System.out.println("A new 'C' object is born!");
        this.setMessage(message);
    }

    public String getMessage() {
        return this.message;
    }

    public void foo() {
        System.out.println("foo");
    }

}
