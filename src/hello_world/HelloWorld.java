package hello_world;

import java.util.Arrays;

/**
 * A program to output the message "Hello World".
 * 
 * @author Daniel Zint
 * @version 0.1
 */
public class HelloWorld {

    /**
     * @param args arguments are not used in this program
     */
    public static void main(String[] args) {
        System.out.println("Please enter a number:");

        int[] a = fibonacci(0, 1, 5);
        System.out.println(Arrays.toString(a));
    }

    public static int[] getCountingArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        return a;
    }

    public static int[] fibonacci(int first, int second, int n) {
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            switch (i) {
                case 0:
                    a[i] = first;
                    break;
                case 1:
                    a[i] = second;
                    break;
                default:
                    a[i] = a[i - 1] + a[i - 2];
                    break;
            }
        }

        return a;
    }
}
