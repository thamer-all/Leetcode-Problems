import java.util.HashMap;
import java.util.Map;

public class isomorphic_String_205 {

    public static void main(String[] args) {

        String a = "add";
        String b = "egg";
        System.out.println(isIsomorphic(a,b));

    }

    public static boolean isIsomorphic(String a , String b){

        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for (Integer i = 0 ; i < a.length(); i++){
            if (map.put(a.charAt(i),i) != map2.put(b.charAt(i),i)){

                return false;
            }
        }

        return true;
    }
}
