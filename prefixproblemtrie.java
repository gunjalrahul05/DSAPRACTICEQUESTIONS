public class prefixproblemtrie {
    static class Node{
        Node arr[] = new Node[26];
        boolean eow = false;
        int freq;

        public Node(){
            for(int i=0;i<arr.length;i++){
                arr[i] = null;
            }

            freq = 1;
        }
    }
    static Node root = new Node();

    public static void insert(String str){
        Node temp = root;

        for(int i=0;i<str.length();i++){
            int idx = str.charAt(i) -'a';

            if(temp.arr[idx] == null){
                temp.arr[idx] = new Node();
            }else{
                temp.arr[idx].freq++;
            }

            temp = temp.arr[idx];
        }

        temp.eow=true;
    }

    public static void findprefix(Node root,String ans){

        if(root==null){
            return;
        }

        if(root.freq==1){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<root.arr.length;i++){
            
            if(root.arr[i]!=null){
                findprefix(root.arr[i], ans+(char)(i+'a'));
            }
        }
    }
    public static void main(String[] args) {
        String arr[] = {"zebra","dog","duck","dove"};

        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }

        root.freq = -1;

        findprefix(root, "");
    }
}
