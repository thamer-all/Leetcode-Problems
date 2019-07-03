import java.util.HashMap;

public class findDiffernce_389 {

    public static void main(String[] args) {

        String a = "abcd";
        String b = "abcde";
        System.out.println(findDiffer(a,b));

    }
    public static char findDiffer(String a , String b){

        int p = b.charAt(a.length());
        for (int i = 0 ; i < a.length(); i++){
            p -=(int)a.charAt(i);
            p +=(int) b.charAt(i);
        }
        return (char) p;
    }
}
