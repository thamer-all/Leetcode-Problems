public class ValidPaldrum2_680 {
    public static void main(String[] args) {
        String a ="abca";
        System.out.println(isValidPlaindrome(a));
    }
    public static boolean isValidPlaindrome(String s){
        int i = 0 , j = s.length()-1;
        while (i < j && s.charAt(i) == s.charAt(j)){
            i++; j--;
        }
        if(i>= j) return true;
        if(isvalid(s,i+1,j)|| isvalid(s,i,j-1)) return true;
        return false;

    }
    public static boolean isvalid(String s , int i , int j){
        while (i< j){
            if(s.charAt(i) == s.charAt(j)){
                i++; j--;
            }
            else return false;
        }
        return true;
    }
}
