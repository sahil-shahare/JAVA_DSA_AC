public class SBuilder {

    // For a given String convert each the first letter of each the first letter of
    // each word to uppercase
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = java.lang.Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(String.valueOf(str.charAt(i)).toUpperCase());
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
        
    }

    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("");
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        // sb.append(ch + " ");
        // }
        // System.out.println(sb);

        System.gc();

        String str = "hi, i am sahil";
        System.out.println(toUpperCase(str));
    }
}
