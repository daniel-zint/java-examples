package oop;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Sparky", 12);
        d1.bark();
        d1.barkAt("tree");

        System.out.println("My dog = " + d1.toString());

        // Dog d2 = new Dog("Sparky Sr.", 7);
        // d2.bark();

    }

    public static void swapDog(Dog d1, Dog d2) {
        Dog dBuf = d1;
        d1 = d2;
        d2 = dBuf;
    }

    public static void setDogAge(Dog d, int age) {
        d.setAge(age);
    }

    public static void f(int i) {
        System.out.println("f(int)");
    }

    public static void f(String s) {
        System.out.println("f(String)");
    }
}
