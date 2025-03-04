import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;

public class maxofsubarray {
    static void printMax(int arr[], int n, int k) {
        Deque<Integer> Qi = new LinkedList<Integer>();
        int i;
        for (i = 0; i < k; ++i) {
            while (!Qi.isEmpty() && arr[ i] >= arr[Qi.peekLast()])
                Qi.removeLast();
            Qi.addLast(i);
        }
        for (; i < n; ++i) {
            System.out.print(arr[Qi.peek()] + " ");
            while ((!Qi.isEmpty()) && Qi.peek() <= i - k)
                Qi.removeFirst();
            while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();
            Qi.addLast(i);
        }
        System.out.print(arr[Qi.peek()]);
    }


    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        List<Integer> l = new ArrayList<>();
        int k = 3;
        int n = arr.length;

        // for (int i = 0; i <= n - k; i++) {
        // int max = Integer.MIN_VALUE;
        // for (int j = i; j < i + k; j++) {
        // max = Integer.max(max, arr[j]);
        // }
        // l.add(max);
        // }

        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(arr[0]);
        for (int i = 1; i < n; i++) {

        }

        System.out.println(l);
    }
}
