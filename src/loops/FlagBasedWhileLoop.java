package loops;

public class FlagBasedWhileLoop {
    public static void main(String[] args) {
        boolean keepGoing = true; // by default, iterate!
        while (keepGoing) {
            // iterate as long as the boolean value in the flag is true
            System.out.println("Iterating!");
            // stop the loop if a random number between 1-100 is equal to 22
            int rand = (int) (Math.random() * 100) + 1;
            // use the ternary operator to flip the value of the flag, if necessary
            keepGoing = (rand == 22) ? false : true; // set to false if the rand value is 22, true otherwise
        }
    }
}
