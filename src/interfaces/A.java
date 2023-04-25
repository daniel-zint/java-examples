package interfaces;

public class A implements Printer {
    private static int counter = 0;
    private String name = "MyNameIsA";

    public void print() {

    }

    public A() {
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name + counter);
    }
}
