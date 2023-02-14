package loops;

public class IterateThroughArray {
    public static void main(String[] args) {
        // an array of strings
        String[] messages = {
                "hi",
                "how are you?",
                "how's it going?",
                "good to see you!",
                "have a great day!",
                "hope to see you around :)"
        };
        // classic for loop that iterates as many times as there are elements in the
        // array
        for (int i = 0; i < messages.length; i++) {
            // print out the value at each position in the array
            System.out.println("The value in the array at index " + i + " is: " + messages[i]);
        }
    }
}
