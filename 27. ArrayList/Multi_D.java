import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Multi_D {
    public static void main(String[] args) {
        List<List<Integer>> mainList = new ArrayList<>();

        List<Integer> list = Arrays.asList(1, 2, 3);

        List<Integer> list2 = Arrays.asList(4, 5, 6);

        List<Integer> list3 = Arrays.asList(7, 8, 9);

        mainList.add(list);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        for (int i = 0; i < mainList.size(); i++) {
            List<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
