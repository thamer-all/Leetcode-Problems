import java.util.*;
public class removeDubLetters_316 {
    public static void main(String[] args) {
        String a = "bcabc";
        System.out.println(removeDub(a));
    }


    public static String removeDub(String a) {
        char[] s = a.toCharArray();
    LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < s.length; i++) {
        set.add(s[i]);
        }
       return   Arrays.toString(set.toArray()).replace("[", "").replace("]", "").replace(",","").trim().replaceAll("\\s","");

        }
        }