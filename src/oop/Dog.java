package oop;

public class Dog {
    // properties
    private String name;
    private int age;
    private static int numberOfDogs = 0;

    // constructor
    public Dog() {
        this.name = "Dog";
        this.age = 0;
        Dog.numberOfDogs++;
    }

    public Dog(String name) {
        this.name = name;
        this.age = 0;
        Dog.numberOfDogs++;
    }

    public Dog(int age) {
        this.name = "Dog";
        this.age = age;
        Dog.numberOfDogs++;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        Dog.numberOfDogs++;
    }

    // getter / setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getNumberOfDogs() {
        return Dog.numberOfDogs;
    }

    // actions
    public void bark() {
        if (this.age < 5) {
            System.out.println(this.name + " says wufwufwuf");
        } else {
            System.out.println(this.name + " says Woof");
        }
    }

    public void barkAt(String name) {
        System.out.println(this.name + " barks at " + name);
    }

    public boolean equals(Dog that) {
        return this.name.equals(that.name) && this.age == that.age;
    }

    public String toString() {
        return this.name + ", age " + this.age;
    }
}
