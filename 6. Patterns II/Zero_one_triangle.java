public class Zero_one_triangle {

    public static void zero_one_triangle(int total_rows) {
        // outer loop
        for (int i = 1; i <= total_rows; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                // condition : even or odd
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        zero_one_triangle(5);
    }
}
