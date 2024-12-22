
public class shortestpathdirection {
    public static float shortestPath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if (s == 'W') {
                x--;
            } else if (s == 'E') {
                x++;
            } else if (s == 'N') {
                y++;
            } else {
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;

        return (float) Math.sqrt(x2 + y2);

    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestPath(str));
    }
}
