package loops;

public class AccumulatorBasedWhileLoop {
    public static void main(String args[]) {
        int i = 0; // set the starting value of the counter
        while (i < 10) {
            // iterate as long as the counter is below some target value
            System.out.println("The value of i is " + i);
            i++; // increment the counter
        }
    }
}
