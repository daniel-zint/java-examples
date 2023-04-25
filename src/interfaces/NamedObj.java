package interfaces;

public interface NamedObj {

    String getName();

    void setName(String name);

    void printName();

    default void celebrateBirthday(int age) {
        System.out.println("Oh no this implemented yet");
    }
}
