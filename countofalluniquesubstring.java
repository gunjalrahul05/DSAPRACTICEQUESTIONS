public class countofalluniquesubstring {

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

    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int cnt=0;

        for(int i=0;i<26;i++){
            if(root.arr[i]!=null){
                cnt+=count(root.arr[i]);
            }
        }

        return cnt+1;
    }
    public static void main(String[] args) {
        String str = "ababa";

        for(int i=0;i<str.length();i++){
            insert(str.substring(i));
        }

        System.out.println(count(root));
    }
}
