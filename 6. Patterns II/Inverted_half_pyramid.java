public class Inverted_half_pyramid {
    public static void inverted_half_pyramid(int total_rows) {
        // outer loop
        for (int i = 1; i <= total_rows; i++) {
            // inner loop
            for (int j = 1; j <= total_rows - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        inverted_half_pyramid(5);
    }
}