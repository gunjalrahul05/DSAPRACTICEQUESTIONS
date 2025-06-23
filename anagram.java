import java.util.HashMap;

public class anagram {
    public static void main(String[] args) {
        String str1 = "evil";
        String str2 = "vile89";

        if(str1.length()!=str2.length()){
            System.out.println("String are not anagram");
            return;
        }
        HashMap<Character,Integer> hs1 = new HashMap<>();
        HashMap<Character,Integer> hs2 = new HashMap<>();
        for(int i=0;i<str1.length();i++){
            hs1.put(str1.charAt(i), hs1.getOrDefault(str1.charAt(i),0)+1);
        }
        for(int i=0;i<str2.length();i++){
            hs2.put(str2.charAt(i), hs2.getOrDefault(str2.charAt(i),0)+1);
        }

        for(int i=0;i<str1.length();i++){
            if(hs1.get(str1.charAt(i))!=hs2.get(str2.charAt(i))){
                System.out.println("Not anagram");
                return;
            }
        }

        System.out.println("String are anagram");
    }
}
