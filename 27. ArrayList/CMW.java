import java.util.Arrays;
import java.util.List;

public class CMW {
    public static void main(String[] args) {
        List<Integer> height = Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7);

        // BruteForce bf = new BruteForce();
        // System.out.println("BruteForce : "+bf.storeWater(height));

        Optimized op = new Optimized();
        System.out.println("Optimized : " + op.storeWater(height));

    }
}

class BruteForce {// O(n^2)
    public int storeWater(List<Integer> height) {
        int maxWater = 0;

        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int wt = j - i;
                int currWater = ht * wt;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
}

// 2 Pointer Approch
class Optimized {// O(n)

    public int storeWater(List<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp != rp) { // while(lp < rp)

            // calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int wt = rp - lp;
            int currWater = ht * wt;
            maxWater = Math.max(maxWater, currWater);

            // Updated ptr
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }
}
