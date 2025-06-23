public class StringPermutations {
    public static void main(String[] args) {
        String str = "abc"; // Example input
        permute(str, "");
    }

    public static void permute(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println("prefix  "+prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, prefix + ch);
        }
    }
}
