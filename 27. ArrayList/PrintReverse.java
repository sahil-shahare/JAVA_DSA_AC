import java.util.ArrayList;
import java.util.List;

public class PrintReverse {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // For adding elements in arraylist
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }
        System.out.println(list);

        // Reverse Print
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

    }
}
