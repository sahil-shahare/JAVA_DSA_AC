import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);

        //asceding
        Collections.sort(list);
        System.out.println(list);

        //descending
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
