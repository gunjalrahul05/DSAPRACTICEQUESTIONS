import java.util.HashSet;

public class recursionbasics {
    public static void increase(int n) {

        if (n == 1) {
            System.out.println(1);
            return;
        }
        increase(n - 1);
        System.out.println(n);
    }

    public static int sumOfNnumber(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNnumber(n - 1);
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int f1mn = fibonacci(n - 1);
        int f2mn = fibonacci(n - 2);

        return f1mn + f2mn;

    }

    public static boolean checksorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return checksorted(arr, i + 1);

    }

    public static int firstOccurance(int arr[], int target, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (target == arr[i]) {
            return i;
        }
        return firstOccurance(arr, target, i + 1);

    }

    public static int lastOccurance(int arr[], int target, int i) {
        if (i < 0) {
            return -1;
        }
        if (target == arr[i]) {
            return i;
        }
        return lastOccurance(arr, target, i - 1);

    }
    // public static int exponential(int n){

    // }

    public static boolean checkPalindrom(String str, int i) {
        if (i == str.length() / 2) {
            return true;
        }

        if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
            return false;
        }
        return checkPalindrom(str, i + 1);
    }

    public static int exponential(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * exponential(x, n - 1);
    }

    public static String reverseString(String str) {
        // if(i==sb.length()/2){
        // return sb;
        // }
        // char ch = sb.charAt(i);
        // sb.setCharAt(i, sb.charAt(sb.length()-i-1));
        // sb.setCharAt(sb.length()-i-1, ch);

        // return reverseString(sb, i+1);

        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static int countOccurance(int arr[], int target, int i) {
        if (i == arr.length) {
            return 0;
        }

        int count = countOccurance(arr, target, i + 1);
        if (target == arr[i]) {
            count++;
        }
        return count;

    }

    public static int sumOfOdd(int arr[], int i) {
        if (i == arr.length) {
            return 0;
        }

        int sum = sumOfOdd(arr, i + 1);
        if (arr[i] % 2 != 0) {
            sum += arr[i];
        }
        return sum;
    }

    public static int stringLength(String str) {
        if (str.length() == 1 || str.isEmpty()) {
            return 1;
        }
        // int cnt=stringLength(str.substring(1));
        // return cnt+1;
        return stringLength(str.substring(1)) + 1;
    }

    public static int maxInArray(int arr[], int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }
        int max = maxInArray(arr, i + 1);

        return max < arr[i] ? arr[i] : max;
    }

    public static int productOfArray(int arr[], int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }
        int product = productOfArray(arr, i + 1);

        return product *= arr[i];
    }

    public static int recursiveSumofDigit(int n) {
        if (n / 10 == 0) {
            return n;
        }
        int n1 = n % 10;// here n1 is store in every stack flask and when code come back after meeting
                        // the base condition
        // it will come back and add then return that value

        // eg
        // n = 234 n1 = 4
        // n = 23 n1 = 3
        // n = 2 n1 = 2 base case occured
        // first time return 2
        // second time 2+3 = 5 return 5
        // third time 5+4 = 9 return 9 to main
        return n1 + recursiveSumofDigit(n / 10);

    }

    public static boolean sortCheck(int arr[], int i) {
        if (i == -1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sortCheck(arr, i - 1);
    }

    public static void decreseandincrease(int n) {

        if (n == 0) {
            return;
        }
        System.out.println(n);
        decreseandincrease(n - 1);
        if (n != 1) {

            System.out.println(n);
        }
    }

    // tilling problem
    public static int tillingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = tillingProblem(n - 1);
        int fnm2 = tillingProblem(n - 2);
        return fnm1 + fnm2;

    }

    // removeduplicate from string
    public static void removeDuplicate(String str, int i, StringBuilder sb, boolean arr[]) {
        if (i == str.length()) {
            System.out.println(sb);
            return;
        }
        char ch = str.charAt(i);

        if (arr[ch - 'a'] == true) {
            removeDuplicate(str, i + 1, sb, arr);
        } else {
            arr[ch - 'a'] = true;
            removeDuplicate(str, i + 1, sb.append(ch), arr);
        }
    }

    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }
    // print all the possible binary string of size n

    public static void binaString(int n, int lastPos, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binaString(n - 1, 0, str + "0");

        if (lastPos == 0) {
            binaString(n - 1, 1, str + "1");
        }
    }

    // assignment question
    public static void findAllOccurance(int arr[], int i, int target) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == target) {
            System.out.println(i + " ");
        }
        findAllOccurance(arr, i + 1, target);
    }

    // assgnment not 2;
    // to solve the code we can creat the array of string type and print the number
    // directly using index insted switch case
    public static void numToString(int n) {
        if (n == 0) {
            return;
        }
        int n1 = n % 10;
        numToString(n / 10);
        switch (n1) {
            case 0:
                System.out.print("zero ");
                break;
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("two ");
                break;
            case 3:
                System.out.print("three ");
                break;
            case 4:
                System.out.print("four ");
                break;
            case 5:
                System.out.print("five ");
                break;
            case 6:
                System.out.print("six ");
                break;
            case 7:
                System.out.print("seven ");
                break;
            case 8:
                System.out.print("eight ");
                break;
            case 9:
                System.out.print("nine ");
                break;
        }
    }

    // tower of hanoi
    public static void towerOfHanoi(int n, int A, int C, int B) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, A, B, C);
        System.out.println("Move disk " + n + "from rod " + A + " to rod " + C);
        towerOfHanoi(n - 1, B, C, A);
    }

    public static int first = -1;
    public static int last = -1;

    public static void firstAndLastOccurance(String str, int i, char c) {
        if (i == str.length()) {
            System.out.println(first + " " + last);
            return;
        }
        if (str.charAt(i) == c) {
            if (first == -1) {
                first = i;
            } else {
                last = i;
            }
        }
        firstAndLastOccurance(str, i + 1, c);

    }

    // add x to the end of the string
    public static void AddAtLastOfTheString(String str, int i, int cnt, String newstr) {
        if (i == str.length()) {
            for (int j = 0; j < cnt; j++) {
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
        if (str.charAt(i) != 'x') {
            newstr += str.charAt(i);
        } else {
            cnt++;
        }
        AddAtLastOfTheString(str, i + 1, cnt, newstr);
    }

    // print all the subsequesces of the string

    public static void subsequesces(String str, int i, String newstr, HashSet hs) {

        if (i == str.length()) {
            if (hs.contains(newstr)) {
                return;
            } else {
                System.out.println(newstr);
                hs.add(newstr);
                return;
            }
        }
        char newChar = str.charAt(i);
        subsequesces(str, i + 1, newstr + newChar, hs);

        subsequesces(str, i + 1, newstr, hs);
    }

    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    // code to print the all the combinations of the keypad
    public static void printCombination(String str, int i, String comb) {

        if (i == str.length()) {
            System.out.println(comb);
            return;
        }
        char currChar = str.charAt(i);
        String mapping = keypad[currChar - '0'];

        for (int j = 0; j < mapping.length(); j++) {
            printCombination(str, i + 1, comb + mapping.charAt(j));
        }
    }

    // print all the possible substring that starts and end with same charachter
    public static void sameSandEsubstring(String str, String newstr, int i, HashSet hs) {
        if (i == str.length()) {
            if (hs.contains(newstr)) {
                return;
            } else {
                // if(newstr.charAt(0)==newstr.charAt(newstr.length()-1)){
                hs.add(newstr);
                System.out.println(newstr);
                return;
                // }

                // return;
            }
        }

        char currChar = str.charAt(i);
        sameSandEsubstring(str, newstr + currChar, i + 1, hs);

        sameSandEsubstring(str, newstr, i + 1, hs);
    }

    // code for counting the total substring that has same starting and ending
    // character

    public static int countSubsequence(String str, int si, int ei) {
        if (si > ei) {
            return 0;
        }

        int firstCharRemoved = countSubsequence(str, si + 1, ei);
        int lastCharRemoved = countSubsequence(str, si, ei - 1);
        int firstAndLastCharRemoved = countSubsequence(str, si + 1, ei - 1);

        int ans = firstCharRemoved + lastCharRemoved - firstAndLastCharRemoved;

        if (str.charAt(si) == str.charAt(ei)) {
            ans++;
        }
        return ans;
    }

    //function to print all the subsequence

    static int cnt=0;
    public static int  printSubsequence(String str,int si,int ei,String newstr,HashSet hs){
        if(si>ei){
            return 0;
        }
        printSubsequence(str, si+1, ei, newstr,hs);
        printSubsequence(str, si, ei-1, newstr,hs);
     printSubsequence(str, si+1, ei-1, newstr,hs);

      
        String substr = str.substring(si,ei+1);
        if(!(hs.contains(substr))){
            hs.add(substr);
            System.out.println(substr);
            cnt++;
        }

        return cnt;
        

    }

    public static void main(String[] args) {

    //     String str = "abcab";
    //    int cnt = printSubsequence(str, 0, 4, "",new HashSet());
    //    System.out.println(cnt);

    towerOfHanoi(3, 10, 20, 50);

    }
}
