public class searchIn2Darr {
    public static boolean search(int arr[][],int key){
        int row=0;
        int col=arr.length-1;
        //Time Complexity is O(m+n) where m number of rows n number of col;
        while(row!=arr.length-1&&col!=0){
            if(arr[row][col]==key){
                System.out.println("Found at row "+row+" col "+col);
                return true;
            }else if(arr[row][col]>key){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };
        
        int key = 14;

        search(arr,key);

    }
}
