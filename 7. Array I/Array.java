import java.util.*;

public class Array {

    // Print
    public static void print(int number[]) {
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }

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

    public static void reverse(int number[]) {
        if (number == null || number.length <= 1) {
            System.out.println("Nothing to reverse");
            return;
        }

        int first = 0;
        int last = number.length - 1;
        while (first < last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
        print(number);
    }

    public static void printPairs(int number[]) {
        if (number == null || number.length < 2) {
            System.out.println("No pairs possible");
            return;
        }

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + number[i] + "," + number[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void subArray(int number[]) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void maxSubarraySum(int number[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += number[k];
                }
                System.out.println(currSum);
                // if (maxSum < currSum) {
                // maxSum = currSum;
                // }
                maxSum = Math.max(maxSum, currSum); // Alternate of if Condition
            }
        }
        System.out.println("MaxSum: " + maxSum);
    }

    public static void kadanes(int number1[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < number1.length; i++) {
            currSum += number1[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.print("Max Sum : "+maxSum);
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
        // binarySearch(number, key);
        // System.out.println("Index for key " + key + " is : " + binarySearch(number,
        // key));

        // reverse(number);
        // printPairs(number);
        // subArray(number);
        // maxSubarraySum(number);
        kadanes(number);

    }
}
