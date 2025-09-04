import javax.swing.event.InternalFrameAdapter;

public class R1 {

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void getSecondLargest(int number[]) {
        int largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int SecondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                SecondLargest = largest;
                largest = number[i];
            }
            if (smallest > number[i]) {
                SecondSmallest = smallest;
                smallest = number[i];
            }
        }
        System.out.println("Largest : " + largest);
        System.out.println("Second Largest : " + SecondLargest);
        System.out.println("Smallest : " + smallest);
        System.out.println("Second Smallest : " + SecondSmallest);
    }

    public static int binarySearch(int number[], int key) {
        int start = 0;
        int end = number.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (key == number[mid]) {
                return mid;
            }

            if (number[mid] < key) { // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverse(int number[]) {
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

    public static void print(int number[]) {
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }

    public static void pairs(int number[]) {
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
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("MaxSum: " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        int key = 18;

        // System.out.println("Key at index : " + linearSearch(numbers, key));

        // getSecondLargest(numbers);
        // System.out.println(binarySearch(numbers, key));
        // reverse(numbers);
        // pairs(numbers);
        // subArray(numbers);
        maxSubarraySum(numbers);
    }
}
