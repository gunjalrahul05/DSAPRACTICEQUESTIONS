public class longestStringwithallprefix {
    
    static class Node{
        Node arr[] = new Node[26];
        boolean eow = false;

        public Node(){
            for(int i=0;i<26;i++){
                arr[i] = null;
            }
        }
    
    }

    static Node root = new Node();

    public static void insert(String s){
        Node temp = root;

        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i)-'a';

            if(temp.arr[idx]==null){
                temp.arr[idx]=new Node();
            }

            temp = temp.arr[idx];
        }

        temp.eow=true;
    }

    static String ans="";

    public static void LongestWord(Node root,StringBuilder res){
        if(root==null){
            return;
        }

        for(int i=0;i<26;i++){

            if(root.arr[i]!=null&&root.arr[i].eow==true){
                res.append((char)(i+'a'));

                if(res.length()>ans.length()){
                    ans = res.toString();
                }

                LongestWord(root.arr[i], res);

                res.deleteCharAt(res.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        
        String word[]={"a","banana","app","appl","ap","apply","apple"};
        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }

        // System.out.println(count(root));

        LongestWord(root, new StringBuilder());

        System.out.println(ans);


    }
}
