public class Hollow_rectangle {

    public static void hollow_rectangle(int total_rows, int total_cols) {
        // outer lopp
        for (int i = 1; i <= total_rows; i++) {
            // inner loop
            for (int j = 1; j <= total_cols; j++) {
                // cell(i,j)
                if (i == 1 || i == total_rows || j == 1 || j == total_cols) { // boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        hollow_rectangle(4, 5);
    }
}
