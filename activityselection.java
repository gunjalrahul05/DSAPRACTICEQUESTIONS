import java.util.Arrays;
import java.util.Comparator;

public class activityselection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,5,7,9,9};

        // int cnt=1;
        // int temp=0;
        // System.out.println("A0");
        // for(int i=1;i<start.length;i++){
        //     if(end[temp]<=start[i]){
        //         cnt++;
        //         temp++;
        //         System.out.println("A"+i);
        //     }
        // }
        // System.out.println(cnt);

        // if end array is not sorted

        int ref[][] = new int[start.length][3];//cause we storing the index for the printing the activity

        for(int i=0;i<start.length;i++){
            ref[i][0]=i;
            ref[i][1]=start[i];
            ref[i][2]=end[i];
        }

        //lambda function is used here
        Arrays.sort(ref,Comparator.comparingDouble(o->o[2]));

        int cnt=1;
        int temp=0;

        for(int i=1;i<start.length;i++){
            if(end[temp]<=start[i]){
                cnt++;
                temp++;
            }
        }

        System.out.println(cnt);


    }
}
