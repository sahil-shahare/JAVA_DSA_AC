import java.util.*;

public class Sum{

    public static int sum(int a, int b) {
        return a + b;        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 =sc.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = sc.nextInt();

        int result = sum(num1 ,num2);
        System.out.println("Sum is: " + result);

    }
}