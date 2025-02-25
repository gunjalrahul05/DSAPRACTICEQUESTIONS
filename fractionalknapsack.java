import java.util.Arrays;
import java.util.Comparator;

public class fractionalknapsack {
    public static void main(String[] args) {
        int weight[] = {10,20,30};
        int profit[] = {60,100,120};

        int w=50;

        int temp[][] = new int[weight.length][3];

        for(int i=0;i<weight.length;i++){
            temp[i][0]=profit[i]/weight[i];
            temp[i][1]=profit[i];
            temp[i][2]=weight[i];
        }
        Arrays.sort(temp,Comparator.comparingDouble(o->o[0]));
        int capacity=w;
        int pro=0;
        for(int i=weight.length-1;i>=0;i--){
            if(capacity>=temp[i][2]){
                pro+=temp[i][1];
                capacity-=temp[i][2];
               
            }else{
                pro+=(temp[i][0]*capacity);
            }
        }

        System.out.println(pro);
    }
}
