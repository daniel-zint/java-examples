package abstract_class;

public class Main {
    public static void main(String[] args) {
        C myObj = new C();
        callF1(myObj);
        A myObj2 = new A();
        callF1(myObj2);
        B myObj3 = new B();
        callF1(myObj3);
    }

    public static void callF1(A a) {
        a.f1();
    }
}
