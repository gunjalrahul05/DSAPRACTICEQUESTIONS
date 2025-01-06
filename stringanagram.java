import java.util.Arrays;

public class stringanagram {
    public static void main(String[] args) {
        String str1 = "eat";
        String str2 = "tea";


        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Strings are anagram");
        }else{
            System.out.println("String are not anagram");
        }
    }
}
