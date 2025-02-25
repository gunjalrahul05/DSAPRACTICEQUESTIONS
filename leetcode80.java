public class leetcode80 {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 3 };

        int cnt = 0, temp = 0, index = 0, total = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            temp = i + 1;
            total++;
            arr[index++] = arr[i];
            cnt = 0;
            while (arr[i] == arr[temp] && temp < arr.length - 1) {

               
                if (cnt < 1) {
                    arr[index++] = arr[temp];
                    System.out.println(arr[index]);
                    total++;
                }
                cnt++;
                temp++;
            }
            i = temp;

        }

        System.out.println("Total "+total);
    }
}
