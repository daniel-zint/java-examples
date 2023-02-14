package loops;

public class IterateThroughString {
    public static void main(String[] args) {
        String s = "asparagus";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
}
