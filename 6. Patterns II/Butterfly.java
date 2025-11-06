public class Butterfly {
    public static void butterfly(int total_rows) {
        // 1st half
        // outer loop
        for (int i = 1; i <= total_rows; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= (2 * (total_rows - i)); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //2nd half
         for (int i = total_rows; i >= 1; i--) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= (2 * (total_rows - i)); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        butterfly(4);
    }
}
