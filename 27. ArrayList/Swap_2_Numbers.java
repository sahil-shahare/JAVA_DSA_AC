import java.util.ArrayList;
import java.util.List;

public class Swap_2_Numbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int idx1 = 1, idx2 = 3;

        System.out.println(list);

        InnerSwap_2_Numbers is = new InnerSwap_2_Numbers();
        is.swap(list, idx1, idx2);
    }
}

class InnerSwap_2_Numbers {

    public void swap(List<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

        System.out.println(list);
    }
}