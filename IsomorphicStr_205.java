import java.util.HashMap;

public class IsomorphicStr_205 {

    public static void main(String[] args) {
        String a = "egg" , b = "add";
        System.out.println(isSomorphic(a,b));

    }
    public static boolean isSomorphic(String a , String b ) {

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            if (map.put(a.charAt(i), i) != map2.put(b.charAt(i), i))
                return false;

        }
        return true;
    }

}
