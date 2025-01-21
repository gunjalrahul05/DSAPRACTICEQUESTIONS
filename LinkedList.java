public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addFirst(int data) {
        Node newnode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newnode;
            return;// compulsary to write here these
        }
        newnode.next = head;

        head = newnode;
    }

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;// cause we have to handle the condtion of the head for index 0 we already
                   // handle these condition in
            // addfirst ie we are directly calling these function;
        }
        size++;
        Node newnode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void addLast(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;// compulsary to write here these
        }
        tail.next = newnode;

        tail = newnode;
    }

    public void print() {
        Node temp = head;

        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        size--;
        int val = head.data;
        head = head.next;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked list is null");
            return Integer.MAX_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int search(int key) {
        if (size == 0) {
            return -1;
        }
        Node temp = head;

        int index = 0;

        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public static int recsearch(int key, Node temp, int i) {
        if (temp.data == key) {
            return i;
        }
        if (temp == null) {
            return -1;
        }
        return recsearch(key, temp.next, i + 1);

    }

    public void reversell() {

        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    public void deleteNthfromEnd(int n) {
        Node temp = head;
        int sz = 0;

        while (temp != null) {
            sz++;
            temp = temp.next;
        }

        if (n == sz) {
            head = head.next;
            return;
        }

        int index = sz - n;
        Node prev = head;

        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return;

    }

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node ls, Node rs) {
        Node mergell = new Node(-1);

        Node temp = mergell;

        while (rs != null && ls != null) {
            if (ls.data <=rs.data) {
                temp.next = ls;
                ls = ls.next;
                temp = temp.next;
            } else {
                temp.next = rs;
                rs = rs.next;
                temp = temp.next;
            }
        }
        while (rs != null) {
            temp.next = rs;
            rs = rs.next;
            temp = temp.next;
        }
        while (ls != null) {
            temp.next = ls;
            ls = ls.next;
            temp = temp.next;
        }

        return mergell.next;
    }

    public Node mergeSort(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        Node mid = findMid(head);

        Node RightHead = mid.next;
        mid.next = null;

        Node leftSort = mergeSort(head);
        Node rightSort = mergeSort(RightHead);

        return merge(rightSort, leftSort);
    }

    public static void zigzag(){
        Node slow= head;
        Node fast = head.next;//cause we want the last digit in the first half that is mid

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }

        Node curr= slow.next;
        slow.next=null;
        Node prev = slow;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }

        Node left = head;
        Node right = prev;

        Node nextl,nextr;

        while(left!=null&&right!=null){
            nextl = left.next;
            left.next = right;

            nextr = right.next;
            right.next=nextl;

            left=nextl;
            right=nextr;

        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        
        ll.print();
       zigzag();
       ll.print();
        // System.out.println("Element found at "+ ll.recsearch(44,head,0));
        // System.out.println("size "+ll.size);

    }
}
