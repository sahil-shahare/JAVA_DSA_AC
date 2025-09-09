public class R2 {

    // Linear Search
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Largest and Smallest Number
    public static void printlargestsmallest(int numbers[]) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Array is empty!");
            return;
        }
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Largest : " + largest);
        System.out.println("Smallest : " + smallest);
    }

    // Binary Search
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Reverse an Array
    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
        // Print
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    // Print Pairs
    public static void printPairs(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
            }
            System.out.println();
        }
    }

    // Print SubArrays
    public static void printSubArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }

    // Max SubArray Sum
    public static void maxSubarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                System.out.print(currSum + " ");
                maxSum = Math.max(maxSum, currSum);
            }
            System.out.println();
        }
        System.out.println("Max Sum : " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10, -12, 14, 16, -18 };
        int key = 18;

        // int index = linearSearch(numbers, key);
        // if (index == -1) {
        // System.out.println("Not Found");
        // } else {
        // System.out.println("Key at index : " + index);
        // }

        // printlargestsmallest(numbers);

        // System.out.println("Index for key is : " + binarySearch(numbers, key));

        // reverse(numbers);

        // printPairs(numbers);

        // printSubArray(numbers);

        maxSubarraySum(numbers);
    }
}
