public class Floyds_triangle {

    public static void floyds_triangle(int total_rows) {
        int counter = 1;
        // outer loop
        for (int i = 1; i <= total_rows; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        floyds_triangle(5);
    }
}
