import java.util.ArrayList;

public class binarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inordertraversal1(Node n) {
        if (n == null) {
            return;
        }

        inordertraversal1(n.left);
        System.out.print(n.data + " ");
        inordertraversal1(n.right);
    }

    public static Node insert(Node n, int val) {
        if (n == null) {
            return new Node(val);
        }

        if (val < n.data) {
            n.left = insert(n.left, val);
        } else {
            n.right = insert(n.right, val);
        }

        return n;
    }

    public static boolean searchinBST(Node n, int k) {
        if (n == null) {
            return false;
        }
        if (n.data == k) {
            return true;
        }

        if (k < n.data) {
            return searchinBST(n.left, k);
        } else {
            return searchinBST(n.right, k);
        }

    }

    public static Node findInorderSuccesor(Node n) {
        while (n.left != null) {
            n = n.left;
        }

        return n;
    }

    public static Node delete(Node n, int key) {
        if(n==null)return null;
        if (key < n.data) {
            n.left = delete(n.left, key);
        } else if (key > n.data) {
            n.right = delete(n.right, key);
        } else {
            // case 1 if no child node
            if (n.left == null && n.right == null) {
                return null;
            }
            // case 2 if only one child node;
            if (n.left == null) {
                return n.right;
            } else if (n.right == null) {
                return n.left;
            }

            Node IS = findInorderSuccesor(n.right);
            n.data = IS.data;

            n.right = delete(n.right, IS.data);

        }
        return n;
    }
    public static void betweenk1andk2(Node n,int k1,int k2){
        if(n==null){
            return;
        }

        if(n.data>=k1&&n.data<=k2){
            betweenk1andk2(n.left, k1, k2);
            System.out.print(n.data+" ");
            betweenk1andk2(n.right, k1, k2);
        }
        // else if(n.data<k1){
        //     betweenk1andk2(n.left, k1, k2);
        // }else{
        //     betweenk1andk2(n.right, k1, k2);
        // }
    }
    public static void printPath(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+"->");
        }
        System.out.println("N");
    }

    public static void printroottoleaf(Node n,ArrayList<Integer> arr){
        if(n==null){
            return;
        }
        arr.add(n.data);
        if(n.left==null&&n.right==null){
            printPath(arr);
        }

        printroottoleaf(n.left, arr);
        printroottoleaf(n.right, arr);
        arr.remove(arr.size()-1);
    }

    // this can be done using the integer value of min and max;
    public static boolean isValidBST(Node n,Node min,Node max){
        if(n==null){
            return true;

        }
        if(min!=null&&n.data<=min.data){
            return false;
        }else if(max!=null&&n.data>=max.data){
            return false;
        }
        
        return isValidBST(n.left, min, n)&&isValidBST(n.right, n, max);
    }

    public static Node mirrorBST(Node n){
        if(n==null){
            return null;
        }

        n.right =mirrorBST(n.left);
        n.left=mirrorBST(n.right);

        // n.left=right;
        // n.right=left;
        // System.out.println(n.data);
        return n;
    }
    public static void preorder(Node n ){
        if(n==null){
            return;
        }

        System.err.print(n.data+" ");
        preorder(n.left);
        preorder(n.right);
    }

    public static Node sortedArraytoBST(ArrayList<Integer> arr,int min,int max){
        if(min>max){
            return null;
        }
        int mid = min+max/2;

        Node n = new Node(arr.get(mid));

        n.left = sortedArraytoBST(arr, min, mid-1);
        n.right = sortedArraytoBST(arr, mid+1, max);

        // System.out.println(n.data);
        return n;
    }
    public static void getInorder(Node n,ArrayList<Integer> ar){

        if(n==null){
            return;
        }
        getInorder(n.left, ar);
        ar.add(n.data);
        getInorder(n.right, ar);

    }
    public static Node balancedBST(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        
        return sortedArraytoBST(res, 0, res.size()-1);

    }

    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST,int size, int min,int max){
            this.isBST=isBST;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    public static int maxsize=0;
    public static Info largestBST(Node root){
        if(root == null){
            return new Info(true, 0,Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info left = largestBST(root.left);
        Info right = largestBST(root.right);

        int size = left.size+right.size+1;
        // System.out.println(size);
        int min = Math.min(root.data,Math.min(left.min,right.min));
        int max = Math.max(root.data, Math.max(left.max,right.max));

        if(left.max>=root.data||right.min<=root.data){
            return new Info(false, size, min, max);
        }

        if(left.isBST&&right.isBST){
            maxsize = Math.max(maxsize, size);
            // System.out.println(maxsize);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }
    public static void inordertraversal(Node n ,ArrayList<Integer> arr){
        if(n==null){
            return ;
        }

        inordertraversal(n.left,arr);
        arr.add(n.data);
        inordertraversal(n.right,arr);

    }

    public static Node createBST(ArrayList<Integer> arr,int min,int max){
        if(min>max){
            return null;
        }

        int mid = (min+max)/2;

        Node n = new Node(arr.get(mid));

        n.left = createBST(arr, min, mid-1);
        n.right = createBST(arr, mid+1, max);

        return n;
    }

    public static Node merge2BST(Node n1 ,Node n2){
        ArrayList<Integer> arr1 = new ArrayList<>();
        inordertraversal(n1,arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        inordertraversal(n2,arr2);

        ArrayList<Integer> finalarr = new ArrayList<>();

        int i=0,j=0;
        while(i<arr1.size()&&j<arr2.size()){
            if(arr1.get(i)<arr2.get(j)){
                finalarr.add(arr1.get(i));
                i++;
            }else{
                finalarr.add(arr2.get(j));
                j++;
            }
        }

        while(i<arr1.size()){
            finalarr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            finalarr.add(arr2.get(j));
            j++;
        }

        Node n = createBST(finalarr,0,finalarr.size()-1);
        
        return n;
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node n = null;

        for (int i = 0; i < values.length; i++) {
            n = insert(n, values[i]);
        }

        // inordertraversal(n);
        // System.out.println();

        // System.out.println(searchinBST(n, 33));

        // delete(n, 11);
        // System.out.println();
        // inordertraversal(n);
        // System.out.println();
        // betweenk1andk2(n, 5, 12);

        // printroottoleaf(n, new ArrayList<>());

        // System.out.println(isValidBST(n, null, null));


        // System.out.println();
        // preorder(n);
        // System.out.println();
        // mirrorBST(n);
        // preorder(n);

        // int arr[] = {3,5,6,8,10,11,12};

        // Node n1 = sortedArraytoBST(arr, 0, arr.length-1);
        // inordertraversal(n1);
        // System.out.println();
        // preorder(n1);

        // Node n2 = new Node(50);
        // n2.left = new Node(30);
        // n2.left.left = new Node(5);
        // n2.left.right = new Node(20);

        // n2.right = new Node(60);
        // n2.right.left = new Node(45);
        // n2.right.right = new Node(70);
        // n2.right.right.left = new Node(65);
        // n2.right.right.right = new Node(80);
        

        // Info info = largestBST(n2);
        // System.out.println("largest bst = "+maxsize);
        // preorder(n2);

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);


        Node f = merge2BST(root1, root2);

        inordertraversal1(f);
    }
}
