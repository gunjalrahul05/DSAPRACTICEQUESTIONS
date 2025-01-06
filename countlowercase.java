public class countlowercase {
    public static int countLowerCase(String str){
        int cnt=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=97&&str.charAt(i)<=117){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        String str = "RahulDIpakGunjal";

        System.out.println("No of lowercase = "+countLowerCase(str));
    }
}
