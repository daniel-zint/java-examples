package loops;

import java.util.Scanner;

public class ParticularResponse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // open the scanner outside the loop, since we could potentially need to
                                              // get more than one int of input
        boolean keepGoing = true; // set the flag to true so this loop will at least iterate once
        while (keepGoing) {
            // get user input
            System.out.print("Please enter an integer between 1 and 10: ");
            int num = scn.nextInt();
            // validate the user's input
            if (num >= 1 && num <= 10) {
                keepGoing = false; // change the value of the flag to cause the loop to terminate
                System.out.println("Thanks for the good input!... quitting loop");
            }
            // if the user's input is invalid, x is still true, so no need to set it to
            // that!
        }
        scn.close(); // close the scanner resource to be nice to the processor
    }
}
