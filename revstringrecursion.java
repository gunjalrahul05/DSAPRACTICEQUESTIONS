public class revstringrecursion {
    public static String rev(String s){
        if(s.length()==1||s.isEmpty()){
            return s;
        }

        return rev(s.substring(1))+s.charAt(0);

        
    }
    public static void main(String[] args) {
        String str = "Rahul Gunjal";

        System.out.println(rev(str));
    }
}
