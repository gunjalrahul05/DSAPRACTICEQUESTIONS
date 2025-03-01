import java.util.ArrayList;
import java.util.Collections;

public class jobsequencing {
    static class Jobs{
        int profit;
        int deadline;
        int id;

        public Jobs(int id,int profit,int deadline){
            this.id=id;
            this.profit=profit;
            this.deadline=deadline;
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{4,20},{1,10},{1,40},{1,30}};


        ArrayList<Jobs> jobs  = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            jobs.add(new Jobs(i,arr[i][1],arr[i][0]));
        }

        Collections.sort(jobs,(a,b)->b.profit-a.profit);

        ArrayList<Integer> al = new ArrayList<>();


        int time=0;

        for(int i=0;i<jobs.size();i++){
            Jobs j1 = jobs.get(i);
            if(j1.deadline>time){
                al.add(j1.id);
                time++;
            }
        }

        // System.out.println(al);

        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }

    }
}
