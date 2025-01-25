import java.util.ArrayList;

public class stackusinglist {
    static class stack {
        static ArrayList<Integer> ll = new ArrayList<>();

        public static boolean isEmpty() {
            if (ll.size() == 0) {
                return true;
            } else {
                return false;
            }
        }

        public static void add(int n) {
            ll.add(n);
        }

        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            int data = ll.get(ll.size() - 1);
            ll.remove(ll.size() - 1);
            return data;
        }

        public static int top() {
            if (isEmpty()) {
                return -1;
            }
            return ll.get(ll.size() - 1);
        }
    }

    public static void main(String[] args) {

    }
}
