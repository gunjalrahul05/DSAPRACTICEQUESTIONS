import java.util.ArrayList;

public class towsumrotatedarr {
    public static void main(String[] args){

      

        ArrayList<Integer> al = new ArrayList<>();
        al.add(11);
        al.add(15);
        al.add(6);
        al.add(18);
        al.add(9);
        al.add(10);

        int target=16;
        int n = al.size();
        int p = -1;
        for(int i=0;i<n;i++){
            if(al.get(i)>al.get(i+1)){
                p=i;
                break;
            }
        }

        int l = p+1;
        int r = p;

        while(l!=r){
            if(al.get(l)+al.get(r)==target){
                System.out.println(l+" "+r);
                return;
            }

            if(al.get(l)+al.get(r)>target){
                r=(n+r-1)%n;
            }else{
                l=(l+1)%n;
            }
        }
        ;

    }
}
