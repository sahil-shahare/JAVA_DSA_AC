
import java.util.*;

public class Sum_product {

    public static void sum(int a, int b) {
        System.out.println("Sum is " + (a + b));

    }

    public static void product(int a, int b) {
        System.out.println("Product is " + (a * b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = sc.nextInt();

        sum(num1, num2);
        product(num1, num2);

    }
}
