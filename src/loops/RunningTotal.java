package loops;

import java.util.Scanner;

public class RunningTotal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int total = 0; // start the total at zero
        String stop_response = "stop"; // what the user must type in order to stop the loop
        String users_response = ""; // will hold what the user types in each iteration
        // keep looping until the user types 'stop'
        while (!users_response.equals(stop_response)) {
            System.out.println("Enter a number: "); // ask for a number
            users_response = scn.nextLine(); // get the user's response as a string
            try {
                int val = Integer.parseInt(users_response); // convert the respose to an int
                total = total + val; // add it to the running total
            } catch (Exception e) {
                // if the user types a non-integer, an error will be caught here
                System.out.println("Sorry, that's not a valid number");
            }
        }
        System.out.println("The total is " + total);
        scn.close();
    }
}
