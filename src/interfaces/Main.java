package interfaces;

public class Main {
    public static void main(String[] args) {

        Printer bObj = new A();
        B bObj2 = (B) bObj;
        bObj2.foo();
    }
}
