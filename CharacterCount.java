import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {

        String name = "Sahil";
        char[] chars = name.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println(map);
    }
}
