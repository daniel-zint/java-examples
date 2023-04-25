package inheritance;

public class A {
    private D d;

    int counter = 0;
    protected String message = "Hello!";

    public A() {
        System.out.println("A new 'A' object is born!");
    }

    public void setD(D d) {
        this.d = d;
    }

    public D getD() {
        return d;
    }

    public String getMessage() {
        // return d.getMessage();
        counter++;
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
