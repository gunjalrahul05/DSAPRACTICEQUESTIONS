import java.util.Queue;

public class queueusinglinkedlist {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next = null;
        }
    }

    static class queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head==null&&tail==null;
        }

        public static void add(int n){

            Node newNode = new Node(n);

            if(head==null){
                head=tail=newNode;
                return;
            }

            tail.next = newNode;
            tail=newNode;

        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }

            int data = head.data;
            if(head==tail){
                head=tail=null;//when only one element is present
            }else{
                head=head.next;
            }
            return data;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {
        
        queue q = new queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
