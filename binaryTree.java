import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class binaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class BinaryTree {
        public static int idx = -1;

        public static Node buildBinaryTree(int arr[]) {
            idx++;

            if (arr[idx] == -1) {
                return null;
            }

            Node newnode = new Node(arr[idx]);

            newnode.left = buildBinaryTree(arr);
            newnode.right = buildBinaryTree(arr);

            return newnode;
        }

        public static void preordertraversal(Node root) {
            if (root == null) {
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data + " ");
            preordertraversal(root.left);
            preordertraversal(root.right);
        }

        public static void inordertraversal(Node n) {
            if (n == null) {
                System.out.print("-1 ");
                return;
            }
            inordertraversal(n.left);
            System.out.print(n.data + " ");
            inordertraversal(n.right);
        }

        public static void postorder(Node n) {
            if (n == null) {
                return;
            }
            postorder(n.left);
            postorder(n.right);
            System.out.print(n.data + " ");
        }

        public static void levertraversal(Node n) {

            Queue<Node> q = new LinkedList<>();

            q.add(n);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();

                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
        public static int height(Node n){

            if(n==null){
                return 0;
            }

            int lh = height(n.left);
            int rh = height(n.right);

            int height = Math.max(lh,rh)+1;

            return height;

        }
        public static int countNodes(Node n ){
            if(n==null){
                return 0;
            }

            int lc = countNodes(n.left);
            int rc = countNodes(n.right);

            int total = lc+rc+1;
            return total;
        }

        public static int sumofnodes(Node n){
            if(n==null){
                return 0;
            }

            int ls = sumofnodes(n.left);
            int rs = sumofnodes(n.right);

            int sum = ls+rs+n.data;

            return sum;
        }
        public static int diameter(Node n){
            if(n==null){
                return 0;
            }

            int ldiam = diameter(n.left);
            int rdiam = diameter(n.right);
            int lh = height(n.left);
            int rh = height(n.right);

            int selfdiam = lh+rh+1;
            return Math.max(selfdiam,Math.max(rdiam, ldiam));
        }

        static class Info{
            int diam;
            int ht;

            public Info(int diam,int ht){
                this.diam=diam;
                this.ht=ht;
            }
        }

        public static Info diameterInfo(Node n){
            if(n==null){
                return new Info(0,0);
            }

            Info linfo = diameterInfo(n.left);
            Info rInfo = diameterInfo(n.right);

            int diam = Math.max(Math.max(linfo.diam,rInfo.diam),linfo.ht+rInfo.ht+1);
            int ht = Math.max(linfo.ht,rInfo.ht)+1;

            return new Info(diam, ht);
        }
        public static boolean isIdentical(Node rootnode,Node subnode){
            if(rootnode==null && subnode == null){
                return true;
            }else if(rootnode==null|| subnode==null||subnode.data!=rootnode.data){
                return false;
            }

            if(!isIdentical(rootnode.left, subnode.left)){
                return false;
            }//is we use the if cause we dont want to follow the top down or bottom up approach 
            //we have to return the directly to the function 
            if(!isIdentical(rootnode.right, subnode.right)){
                return false;
            }

            return true;
        }
        public static boolean isSubtree(Node rootnode,Node subnode){

            if(rootnode==null){
                return false;
            }

            if(rootnode.data==subnode.data){
                if(isIdentical(rootnode,subnode)){
                    return true;
                }
            }

            boolean lefttree = isSubtree(rootnode.left, subnode);
            boolean righttree = isSubtree(rootnode.right, subnode);

            return lefttree||righttree;
        }

        static class Info1{
            Node node;
            int hd;

            public Info1(Node node,int hd){
                this.node=node;
                this.hd=hd;
            }
        }

        public static void topView(Node n){

            Queue<Info1> q = new LinkedList<>();

            HashMap<Integer,Node> hs = new HashMap<>();

            int min=0;
            int max=0;

            q.add(new Info1(n, 0));
            q.add(null);

            while(!q.isEmpty()){
                Info1 temp = q.remove();

                if(temp==null){
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{

                    if(!hs.containsKey(temp.hd)){
                        hs.put(temp.hd, temp.node);
                    }

                    if(temp.node.left!=null){
                        q.add(new Info1(temp.node.left,temp.hd-1));
                        min = Math.min(min,temp.hd-1);
                    }

                    if(temp.node.right!=null){
                        q.add(new Info1(temp.node.right,temp.hd+1));
                        max = Math.max(max,temp.hd+1);
                    }
                }

            }
            for(int i=min;i<=max;i++){
               
                    System.out.println(hs.get(i).data);
                
            }
        }
        public static void kthlevel(Node n,int level,int k){
            if(n==null){
                return;
            }

            if(level==k){
                System.out.print(n.data+" ");
                return;
            }
            kthlevel(n.left, level+1, k);
            kthlevel(n.right, level+1, k);
        }
        public static boolean findPath(Node n,int n1,ArrayList<Node> path){

            if(n==null){
                return false;
            }
            path.add(n);

            if(n.data==n1){
                return true;
            }

            boolean left = findPath(n.left, n1, path);
            boolean right = findPath(n.right, n1, path);

            if(left||right){
                return true;
            }

            path.remove(n);
            return false;
        }
        public static Node lowestCommonAcestor(Node n,int n1,int n2){
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            findPath(n,n1,path1);
            findPath(n,n2,path2);

            int i=0;
            for(;i<path1.size()&& i<path2.size();i++){
                if(path1.get(i).data!=path2.get(i).data){
                    break;
                }
            }

            return path1.get(i-1);
        }
        public static Node lowestCommenAncestorOpt(Node n,int n1,int n2){


            if(n==null){
                return null;
            }

            if(n.data==n1||n.data==n2){
                return n;
            }

            Node left = lowestCommenAncestorOpt(n.left, n1, n2);
            Node right = lowestCommenAncestorOpt(n.right, n1, n2);

            if(left==null){
                return right;
            }
            if(right==null){
                return left;
            }

            return n;
        }
        public static int finddistance(Node root,int n){
            if(root==null){
                return -1;
            }

            if(root.data==n){
                return 0;
            }

            int left = finddistance(root.left, n);
            int right=finddistance(root.right, n);

            if(left==-1&&right==-1){
                return -1;
            }else if(left==-1){
                return right+1;
            }else{
                return left+1;
            }
        }

        public static int minDistance(Node n,int n1,int n2){
            Node lca = lowestCommenAncestorOpt(n, n1, n2);

            int leftd = finddistance(lca,n1);
            int rightd = finddistance(lca,n2);

            return leftd+rightd;
        }

        public static int KAncestor(Node root,int n ,int k ){

            if(root==null){
                return -1;
            }

            if(root.data==n){
                return 0;
            }

            int left = KAncestor(root.left, n, k);
            int right = KAncestor(root.right, n, k);


            if(left==-1&&right==-1){
                return -1;
            }

            int max = Math.max(left,right);

            if(max+1==k){
                System.out.println(root.data);
            }

            return max+1;
        }

        //Transform to  Sum Tree

        public static int transfomSumtree(Node n ){
            if(n==null){
                return 0;
            }
            
            int left = transfomSumtree(n.left);
            int right = transfomSumtree(n.right);
            
            int data1 = n.data;

            int newleft = n.left==null?0:n.left.data;
            int newright = n.right==null?0:n.right.data;


            n.data = right+newleft+left+newright;

            //upper 3 line code can be written as down
            // if(n.left==null&&n.right==null){
            //     n.data= left+right;
            // }else if(n.left!=null&&n.right!=null){
            //     n.data = right+n.right.data+left+n.left.data;
            // }
            // else if(n.right!=null){
            //     n.data = right+n.right.data+left;
            // }else if(n.left!=null){
            //     n.data=left+right+n.left.data;

            // }

            
           

            return data1;
        }

        public static boolean ckeckUnivalied(Node n,int k){
            if(n==null){
                return true;
            }

            if(n.data!=k){
                return false;
            }

            boolean left = ckeckUnivalied(n.left,k);
            boolean right = ckeckUnivalied(n.right, k);

            return left&&right;

        }
        
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 5, -1, -1, 2, -1, -1, 2, -1, 2, -1, -1 };

        BinaryTree tree = new BinaryTree();

        Node n = tree.buildBinaryTree(arr);

        // System.out.println(n.data);

        //creating a subnode

        // Node subNode = new Node(2);
        // subNode.left= new Node(4);
        // subNode.right = new Node(5);
        // // subNode.right.right = new Node(8);

        // tree.levertraversal(n);

        // System.out.println(" Diameter of a tree = "+tree.isSubtree(n,subNode));

        // tree.topView(n);

        // tree.kthlevel(n, 1, 3);

        // System.out.println(tree.lowestCommonAcestor(n, 4, 5).data);

        // System.out.println(tree.lowestCommenAncestorOpt(n, 4, 6).data);

        // System.out.println(tree.minDistance(n, 4, 6));

        // tree.KAncestor(n, 5, 1);

        // tree.transfomSumtree(n);
        // tree.preordertraversal(n);

        System.out.println(tree.ckeckUnivalied(n, n.data));
        
    }
}
