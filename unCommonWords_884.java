import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class unCommonWords_884 {

    public static void main(String[] args) {

        String a = "this apple is sweet";
        String b = "this apple is sour";


        String[] arr = uncommonSenetence(a,b);
        for (int i= 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static String [] uncommonSenetence(String A , String B ){


        Map<String, Integer> count = new HashMap<>();
        for (String w : (A + " " + B).split(" "))
            count.put(w, count.getOrDefault(w, 0) + 1);
        ArrayList<String> res = new ArrayList<>();
        for (String w : count.keySet())
            if (count.get(w) == 1)
                res.add(w);
        return res.toArray(new String[0]);


    }
}
