public class DoublyLinkedList {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int n) {//static method can only access static members that why its non static;
        Node newNode = new Node(n);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void addlast(int n){
        size++;
        Node newNode = new Node(n);
        if(head==null){
            head=tail=newNode;
            return;
        }

        // Node temp =head;

        // while(temp.next!=null){
        //     temp=temp.next;
        // }
        
        // temp.next=newNode;
        // newNode.prev=temp;
        // tail=newNode;

        tail.next= newNode;
        newNode.next=null;
        newNode.prev=tail;
        tail=newNode;
    }

    public int removeFirst(){
        
        if(head==null){
            System.out.println("Linked list is null");
            return Integer.MIN_VALUE;
        }
        size--;
        int data = head.data;
        head= head.next;
        head.prev=null;
        return data;
    }

    public void print(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int removeLast(){
        if(head==null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        // Node temp = head;
        // while(temp.next!=null){
        //     temp=temp.next;
        // }

        // size--;
        // int data= temp.data;
        // tail=temp.prev;
        // tail.next=null;
        //because our tail is up to date we directly do these

        int data = tail.data;
        size--;
        tail =tail.prev;
        tail.next=null;
        return data;
    }

    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head =prev;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
       dll.addlast(44);
        dll.print();

        dll.reverse();
        dll.print();
    }
}
