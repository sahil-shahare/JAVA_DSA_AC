public class Inverted_rotated_half_pyramid {

    public static void inverted_rotated_half_pyramid(int total_rows) {
        // outer loop
        for (int i = 1; i <= total_rows; i++) {
            // spaces
            for (int j = 1; j <= total_rows - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_rotated_half_pyramid(4);
    }
}
