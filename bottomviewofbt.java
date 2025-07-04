public class bottomviewofbt {
    static class Node {
        int data;
        int hd;
        Node left, right;

        public Node(int key) {
            this.data = key;
            this.hd = Integer.MAX_VALUE;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {

        Node root=new Node(20);
        root. left=new Node(8);
        root.right=new Node(22);
        root.left.left=new Node(5);
        root.left.right=new Node(3);
        root.right.left=new Node(4);
        root.right.right=new Node(25);
        root.left.right.left=new Node(10);
        root.left.right.right=new Node(14);
    }
}
