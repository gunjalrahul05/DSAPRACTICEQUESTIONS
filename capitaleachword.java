public class capitaleachword {
    public static String toUpperCase(String str){

        StringBuilder newstr = new StringBuilder("");

        newstr.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '){
                newstr.append(str.charAt(i));
                newstr.append(Character.toUpperCase(str.charAt(i+1)));
                i++;
            }else{
                newstr.append(str.charAt(i));
            }
        }

        String str1 = newstr.toString();
        return str1;
    }
    public static void main(String[] args) {

        String str= "hi i am rahul";

        System.out.println(toUpperCase(str));
        
    }
}
