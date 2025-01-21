import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class threesum {
    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hs.put(arr[i], i);
        }
        HashMap<Integer,Integer> ns = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                int comp = 0 - (arr[i] + arr[j]);
                System.out.println(" I am here for "+arr[i]+" + "+arr[j]+" "+comp);
                List<Integer> l1 = new ArrayList<>();
                Set<List<Integer>> s = new HashSet<>();
                if (hs.containsKey(comp) && i != j && j!=hs.get(comp)&&i!=hs.get(comp)) {
                    l1.add(arr[i]);
                    l1.add(arr[j]);
                    l1.add(comp);
                    ns.put(arr[i],i);
                    System.out.println("Check here");
                    if(!s.contains(l1)){
                        res.add(l1);
                    }
                    s.add(l1);
                }
            }
        }

System.out.println(res);
    }
}
