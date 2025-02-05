public class temp {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "dcba";
        if (s1.equals(s2)) {
            System.out.println("true");
        }

        for (int i = 0; i < s2.length(); i++) {
            StringBuilder sb = new StringBuilder(s2);
            for (int j = i + 1; j < s2.length(); j++) {
                System.out.println(i + " " + j);
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                System.out.println(sb);
                s2 = sb.toString();
                if (s1.equals(s2)) {
                    System.out.println("true from here");
                }

                sb = new StringBuilder(s2);

                temp = sb.charAt(j);
                sb.setCharAt(j, sb.charAt(i));
                sb.setCharAt(i, temp);
                System.out.println(i + " " + j);
                System.out.println("print from here "+sb);

            }
            s2 =sb.toString();
        }
        System.out.println("false");
    }
}
