import java.util.*;

public class wordPattern_290 {
    public static void main(String[] args) {

        String a = "abb" , b = "apple cat cat";
        System.out.println(wordPatter(a,b));

    }
    public static boolean wordPatter(String a , String b ){

        String [] words = b.split(" ");


        Map map = new HashMap();

        for (int i = 0 ; i < words.length; i++)
           if (map.put(a.charAt(i),i) != map.put(words[i],i))
               return false;
               return true;

    }
}
