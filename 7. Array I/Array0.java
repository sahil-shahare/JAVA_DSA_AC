import java.util.*;

public class Array0 {

    // LinearSearch
    public static int linearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void getlargestsmallest(int number[]) {

        if (number == null || number.length == 0) {
            System.out.println("Array is empty!");
            return;
        }
        int largest = Integer.MIN_VALUE; // -Infinity
        int smallest = Integer.MAX_VALUE; // +Infinity
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("Largest : " + largest);
        System.out.println("Smallest : " + smallest);
    }

    public static int binarySearch(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // in int never overflows because subtraction keeps the number within
                                                 // safe range.

            if (number[mid] == key) { // Found
                return mid;
            }
            if (number[mid] < key) { // right
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User Input
        // int[] arr = new int[5];
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print("Enter Number: ");
        // arr[i] = sc.nextInt();
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println("arr[" + i + "] = " + arr[i]);
        // }

        int[] number = { 20, 4, 6, 8, 10, 102, 14, 16, 18 };
        int key = 16;
        // int index = linearSearch(number, key);
        // System.out.println("Key " + key + " at index : " + index);

        // getlargestsmallest(number);
        binarySearch(number, key);
        System.out.println("Index for key " + key + " is : " + binarySearch(number, key));
    }
}
