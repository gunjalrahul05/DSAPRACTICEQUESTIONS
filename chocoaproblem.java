import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class chocoaproblem {
    public static void main(String[] args) {
        Integer costver[] = { 2, 1, 3, 1, 4 };
        Integer costhor[] = { 4, 1, 2 };

        Arrays.sort(costver, Collections.reverseOrder());
        Arrays.sort(costhor, Collections.reverseOrder());

        int h = 0, v = 0, hp = 1, vp = 1;
        int cost = 0;

        while (h < costhor.length && v < costver.length) {
            if (costver[v] <= costhor[h]) {
                cost += (costhor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (costver[v] * hp);
                vp++;
                v++;

            }
        }

        while (h < costhor.length) {
            cost += (costhor[h] * hp);
            vp++;
            v++;
        }
        while (v< costver.length) {
            cost += (costver[h] * hp);
            vp++;
            v++;
        }

        System.out.println("Minimum cost is " + cost);
    }
}
