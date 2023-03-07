package multi_dim_arrays;

public class ThreeDimExample {
    public static void main(String[] args) {
        String[][][] words = {
                {
                        { "who", "what", "when", "why", "how" },
                        { "whither", "whence", "wherefore" }
                },
                {
                        { "there", "that", "then" },
                        { "thence", "hence", "heretofore" }
                }
        };

        DeepPrintArray.print(words);

        System.out.println("words[0][1][2] = " + words[0][1][2]);

        int[][] n = new int[1][];
        n[0] = new int[] { 1, 2, 3 };
        DeepPrintArray.print(n);
    }
}
