import java.util.HashMap;

public class squareroot {
    public static void main(String[] args) {
        String str = "aaakbbccdde";
        HashMap<Character, Integer> hs = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            hs.put(str.charAt(i), hs.getOrDefault(str.charAt(i), 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (!(hs.get(str.charAt(i)) > 1)) {
                System.out.println("character is " + str.charAt(i));
                return;

            }
        }
        System.out.println("Not a single character");

    }
}
