public class removedublicaterec {
    public static void removedub(String s,int arr[],int i,String res){
        if(i==s.length()-1){
            System.out.println(res);
            return;
        }

        char ch = s.charAt(i);

        if(arr[ch-'a']!=1){
            arr[ch-'a']=1;
            res+=ch;
        }
        removedub(s, arr, i+1, res);
    }
    
    public static void main(String[] args) {
        String s = "raaahullllll";
        int arr[] = new int[26];

        String res="";

        // for(int i=0;i<s.length();i++){
        //     char ch = s.charAt(i);
        //     if(arr[ch-'a']!=1){
        //         arr[ch-'a']=1;
        //         res+=ch;
        //     }
        // }

        // System.out.println(res);

        removedub(s, arr, 0, res);
    }
}
