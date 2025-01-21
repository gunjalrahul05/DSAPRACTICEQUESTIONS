import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class expo {
    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hs.put(arr[i], i);
        }
        HashMap<Integer, Integer> h = new HashMap<>();
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                int comp = 0 - (arr[i] + arr[j]);
                System.out.println(comp);
                if (h.containsKey(comp)) {
                    break;
                } else {
                    h.put(comp, comp);
                }
                if (hs.containsKey(comp) && i != j && j != hs.get(comp) && i != hs.get(comp)) {
                    List<Integer> l = new ArrayList<>();
                    l.add(arr[i]);
                    l.add(arr[j]);
                    l.add(comp);
                    System.out.println("I am here" + l);
                    l1 = l;
                }
            }
            res.add(l1);
        }

        System.out.println(res);
    }
}