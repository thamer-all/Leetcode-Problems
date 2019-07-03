import java.util.*;

public class firstUniqueChat_387 {

    public static void main(String[] args) {

        String n ="leletcode";

        System.out.println(firstUniq(n));
        System.out.println(firstUniq2(n));

    }

    public static int firstUniq(String s){


        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0 ; i < s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (int i = 0 ; i < s.length(); i++){
            if (map.get(s.charAt(i))==1)
                return i;
        }

        return -1;
    }
    public static int firstUniq2(String s){

        int[] arr = new int[256];
        char[] chars = s.toCharArray();
        for (int i = 0 ; i < chars.length; i++){
            arr[chars[i]]++;
        }
        for (int i = 0 ; i < chars.length; i++){
            if (arr[chars[i]] == 1){
                return i;
            }
        }
        return -1;
    }
}
