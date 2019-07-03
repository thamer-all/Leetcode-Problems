import java.util.*;
public class word_Patter_290 {

    public static void main(String[] args) {

        String pattern  =  "abb";
        String  s = "egg bee bee";


        System.out.println(wordP(pattern,s));
    }

    public static boolean wordP(String pattern , String s ){
        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i=0; i<words.length; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        return true;
    }
}
