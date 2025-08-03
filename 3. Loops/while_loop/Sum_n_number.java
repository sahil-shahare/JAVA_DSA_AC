import java.util.*;
public class Sum_n_number{
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum );
    }
}