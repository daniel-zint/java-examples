package inheritance;

public class A {
    public A() {
        System.out.println("A new 'A' object is born!");
        this.message = "Hello!";
    }

    protected String message;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
