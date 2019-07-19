import java.util.HashSet;
import java.util.Set;

public class intersectionTwoArr_349 {

    public static void main(String[] args) {

        int [] arr = {1,2,2,1};
        int [] arr2 = {2,2};
        System.out.println(intersection(arr,arr2));

    }
    public static int[] intersection(int []a, int []b){

        Set<Integer> res = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int i  = 0 ; i < a.length; i++){
            set.add(a[i]);
        }
        for (int i  = 0 ; i < b.length; i++){
            if (set.contains(b[i]))
                res.add(b[i]);
        }

        int ans [] = new int[res.size()];
        int n = 0;
        for (int i : res)
            ans[n++] = i;
        return ans;
    }


}
