import java.util.Arrays;
public class checkanagram {
    public static boolean checkAnagrambruteforce(String str1, String str2){
        for(int i=0;i<str1.length();i++){
            int cnt=0;
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    cnt++;
                }
            }
            if(cnt!=1){
                return false;
            }
        }
        return true;
    }
    public static boolean checkAnagram(String str1,String str2){

        if(str1.length()!=str2.length()){
            return false;
        }
        //lowercase? do not need to check explicitly for the lower case and upper case;
        str1= str1.toLowerCase();
        str2 = str2.toLowerCase();

        //converting to the array cause checking the string is easy;
        char str1arr[] = str1.toCharArray();
        char str2arr[] = str2.toCharArray();

        Arrays.sort(str1arr);
        Arrays.sort(str2arr);


        //we can use the equals method for the sort arrays
        if(Arrays.equals(str1arr,str2arr)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str1 ="earth";
        String str2 ="heart";

        System.out.println(checkAnagram(str1, str2));

    }
}

