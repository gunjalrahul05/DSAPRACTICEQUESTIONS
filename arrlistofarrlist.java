import java.util.ArrayList;
public class arrlistofarrlist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        ArrayList<Integer> al3 = new ArrayList<>();

        // al1.add(1);
        // al1.add(2);
        // al1.add(3);
        // al1.add(4);
        // al1.add(5);

        // al2.add(2);
        // al2.add(4);
        // al2.add(6);
        // al2.add(8);
        // al2.add(10);

        // al3.add(3);
        // al3.add(6);
        // al3.add(9);
        // al3.add(12);
        // al3.add(15);

        mainList.add(al1);
        mainList.add(al2);
        mainList.add(al3);
        for(int i=1;i<=5;i++){
            al1.add(i*1);
            al2.add(i*2);
            al3.add(i*3);
        }

        for(ArrayList<Integer> i :mainList){
            for(int num:i){
                System.out.print(num+" ");
            }
            System.out.println();
        }



    }
}
