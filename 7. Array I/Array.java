public class Array {

    // Print
    public static void print(int number[]) {
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }

    // Reverse an Array
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

    // Pairs of an Array
    public static void pairs(int number[]) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + number[i] + "," + number[j] + ") ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // SubArrays
    public static void subArray(int number[]) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        // reverse(number);
        // pairs(number);
        subArray(number);
    }
}