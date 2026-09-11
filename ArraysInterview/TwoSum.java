import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] n1 = { 1, 2, 3, 5, 6, 7, 8 };
        twoSum(n1, 15);
    }

    public static int[] twoSum(int[] n, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n.length; i++) {
            int result = target - n[i];
            if (map.containsKey(result)) {
                // System.out.println("Index: " + map.get(result) + ", " + i);
                return new int[] { map.get(result), i };
            }
            map.put(n[i], i);
            // System.out.println("Not Found");

        }
        return new int[] {};
    }
}
