public class Anagram {
    public static void main(String[] args) {
        String a = "anagram";
        String b = "nagaram";
        System.out.println(anagram(a,b));
    }
    public static boolean anagram(String a , String b ) {

        if (a.length() != b.length()) return false;
        int[] arr = new int[26];
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            arr[b.charAt(i) - 'a']--;
            if (arr[b.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
