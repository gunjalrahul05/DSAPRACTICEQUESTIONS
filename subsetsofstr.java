public class subsetsofstr {
    public static void subSets(String str,int i,String ans){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        subSets(str, i+1, ans+str.charAt(i));
        subSets(str, i+1, ans);
    }
    public static void main(String[] args) {
        String str = "abc";

        subSets(str, 0, "");
    }
}
