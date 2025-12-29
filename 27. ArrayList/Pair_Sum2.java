import java.util.ArrayList;
import java.util.List;

//Que Find if any pair in a Sorted and Rotated ArrayList has a target sum  

public class Pair_Sum2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        Optimized op = new Optimized();
        System.out.println(op.pairSum2(list, target));
    }
}

// 2 Pointer Approch with Modular Arthmetic
class Optimized {
    public boolean pairSum2(List<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1;
        int rp = bp;

        while (lp != rp) {
            // case1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }
}
