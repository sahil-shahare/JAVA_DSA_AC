public class Strings {

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static double getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            int dir = path.charAt(i);
            // South
            if (dir == 'S') {
                y--;
            }
            // North
            else if (dir == 'N') {
                y++;
            }
            // West
            else if (dir == 'W') {
                x--;
            }
            // East
            else {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String str = "racecar"; // noon, madam

        // System.out.println(isPalindrome(str));
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
