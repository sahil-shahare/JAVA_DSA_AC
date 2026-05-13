import java.util.Arrays;
import java.util.List;

//Que Find if any pair in a sorted ArrayList has a target sum   
// list = [1,2,3,4,5,6]; target = 5;

public class Pair_Sum1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        int target = 50;

        // BruteForce bf = new BruteForce();
        // System.out.println(bf.pairSum1(list, target));

        Optimized op = new Optimized();
        System.out.println("Optimized : " + op.pairSum1(list, target));
    }
}

class BruteForce {// O(n^2)
    public boolean pairSum1(List<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
}

class Optimized {// O(n)
    public boolean pairSum1(List<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp != rp) {// while(lp < rp)
            // case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            }
            // case 3
            else {
                rp--;
            }
        }
        return false;
    }
}