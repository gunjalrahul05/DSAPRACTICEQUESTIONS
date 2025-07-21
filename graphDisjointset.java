public class graphDisjointset {
    static int n=7;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init(){
        for(int i=0;i<par.length;i++){
            par[i] = i;
        }
    }

    public static int find(int x){
        if(x==par[x]){
            return x;
        }

        return find(par[x]);
    }

    public static void union(int a,int b){
        int parA=find(a);
        int parB=find(b);

        if(parA==parB){
            rank[parA]=parB;
            rank[parA]++;
        }else if(parA<parB){
            rank[parA]=parB;
        }else{
            rank[parB]=parA;
        }
    }


   public static void main(String[] args) {
    
   } 
}
