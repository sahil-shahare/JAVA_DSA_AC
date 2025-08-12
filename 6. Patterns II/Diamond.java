public class Diamond {
    public static void diamond(int total_rows) {
        // 1st half
        // outer loop
        for (int i = 1; i <= total_rows; i++) {
            // spaces
            for (int j = 1; j <= total_rows - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = total_rows; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= total_rows - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond(4);
    }
}
