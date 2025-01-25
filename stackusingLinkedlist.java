public class stackusingLinkedlist {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next =null;
        }
    }
    public static Node head;
    public static int size = 0;
    static class stack{
        public static boolean isEmpty(){
            //here doen't need to use the size variable 
            //we can directly define it by the checking the head is null or not ;
            // if(size==0){
            //     return true;
            // }else{
            //     return false;
            // }
           return head==null;
        }

        public static void push(int data){
            Node newnode = new Node(data);
            size++;
            if(isEmpty()){
                head=newnode;
                return;
            }

            newnode.next = head;
            head = newnode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            size--;
            int data = head.data;
            
            head = head.next;
            return data;
        }
        public static int peek(){
            return head.data;
        }

    }
    public static void main(String[] args) {
        stack s = new stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
