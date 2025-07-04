public class trie {
    public static class Node{
        Node arr[] = new Node[26];
        boolean eow;

        public Node(){
           for(int i=0;i<26;i++){
            arr[i] = null;
           }
        }
    }
    public static Node root = new Node();
    
    public static void insert(String word){
        Node curr = root;

        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';

            if(curr.arr[idx]==null){
                curr.arr[idx] = new Node();
            }

            curr = curr.arr[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String word){
        
        Node curr = root;
        for(int i=0;i<word.length();i++){

            int idx = word.charAt(i)-'a';

            if(curr.arr[idx]==null){
                return false;
            }
            curr= curr.arr[idx];
        }

        return curr.eow == true;
    }
    public static void main(String[] args) {

        String word[] = {"the","a","there","their","any","thee"};

        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }        

        if(search("there")){
            System.out.println("found ");
        }else{
            System.out.println("Not Found");
        }
    }
}
