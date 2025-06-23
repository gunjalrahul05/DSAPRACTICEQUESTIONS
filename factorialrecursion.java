public class factorialrecursion {
    public static int fact(int n){
        if(n==0){
            return 1; 
        }
        int fnm1 = fact(n-1);
        int fn = n*fnm1;

        return fn;
    }

    public static int sumofnnumber(int n){
        if(n==0){
            return 0;
        }
        
        int sum=n+sumofnnumber(n-1);
        return sum;
    }
    public static boolean checksortedarr(int i,int arr[]){
        if(i==arr.length){
            return true;
        }
        if(arr[i-1]>arr[i]){
            return false;
        }
        boolean temp  =checksortedarr(i+1, arr);
        return temp;
    }
    public static int firstOccurance(int arr[],int i,int key){
        if(i==arr.length-1){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

        int index = firstOccurance(arr, i+1, key);
        return index;
    }
    public static int lastOccurance(int arr[],int i,int key){
        
        if(i==arr.length){
            return -1;
        }
        int isfound = lastOccurance(arr, i+1, key);

        if(isfound==-1&&arr[i]==key){
            return i;
        }

        return isfound;
    }
    public static int xpowern(int x,int n){
        if(n==1){
            return x;

        }
        int  mul = xpowern(x, n-1)*x;
        return mul;
    }

    public static int xpowernopt(int x,int n){

        if(n==1){
            return x;
        }
        int mul = xpowernopt(x, n/2);

        int pow = mul*mul;
        if(n%2!=0){
            pow=pow*x;
        }

        return pow;
    }
    public static void removeduplicate(String s,String res, boolean temp[],int i){
        if(i==s.length()){
            System.out.println(res);
            return;
        }

        if(temp[s.charAt(i)-'a'] == false){
            temp[s.charAt(i)-'a']=true;
            res+=s.charAt(i);
        }

        removeduplicate(s, res,temp, i+1);
    }
    public static int friendparing(int n){
        if(n==1||n==2){
            return n;
        }

        int fnm1 = friendparing(n-1);
        int fnm2 = friendparing(n-2);

        int pairingtotal = fnm2*(n-1);

        int totalpairs = fnm1+pairingtotal;

        return totalpairs;
    }
    public static void main(String[] args) {
        // System.out.println(fact(5));

        // System.out.println(sumofnnumber(5));

        int arr[] = {8,1,2,2,5,6,7,2,2};

        // System.out.println(checksortedarr(1, arr));

        // System.out.println(lastOccurance(arr, 0, 2));


        // System.out.println(xpowernopt(2, 4));
        boolean temp[] = new boolean[26];

        // removeduplicate("rrahuullsl","",temp,1);
        System.out.println(friendparing(3));
    }
}
