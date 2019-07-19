import java.util.*;

public class singleNum_136 {

    public static void main(String[] args) {

        int[] arr = {2, 2, 6, 1, 3, 3, 1};
        System.out.println("using a Set runtime : o(n); space : o(n)");
        System.out.println(singleNum(arr));
        System.out.println("using a BitWise runtime : o(n); space : o(1)");
        System.out.println(singleNum2(arr));

    }

    public static int singleNum(int[] num) {

        // find the uniqe element

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < num.length; i++) {
            if (!set.remove(num[i]))
                set.add(num[i]);


        }
        return set.iterator().next();
    }

    public static int singleNum2(int[] num) {

        int res = 0;
        for (int i = 0; i < num.length; i++)
            res ^= num[i];
        return res;
    }
}
