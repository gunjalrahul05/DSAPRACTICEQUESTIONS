public class countingsort {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        int n = arr.length;

        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max, arr[i]);
        }
        int count[] = new int[max+1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            while (count[i] != 0) {
                arr[cnt] = i;
                cnt++;
                count[i]--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}