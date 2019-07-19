public class AnagramStrings_242 {

    public static void main(String[] args) {

        String a = "bca" , b = "cab";
        System.out.print(isAnagram(a,b));

    }
    public static boolean isAnagram(String a , String b  ){

        if (a.length() != b.length()) return false;
        int [] arr = new int[26];
        for (int i = 0 ; i < a.length(); i++){
            arr[a.charAt(i) - 'a']++;
            arr[b.charAt(i) -'a']--;
        }
        for (int n : arr){
            if (n != 0)return false;
        }
        return true;
    }
}
