import java.util.*;

public class SingleNumber_126 {

    public static void main(String[] args) {

        int [] nums = {1,3,1,4,5,4,5};

        System.out.println("Using a HashSet : ");
        System.out.println(single(nums));
        System.out.println("Using BitWise");
        System.out.println(single2(nums));

    }
    public static int single(int [] nums){

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0 ; i < nums.length; i++){
            if (!set.remove(nums[i]))
                set.add(nums[i]);
        }
        return set.iterator().next();
    }

    public static int single2(int [] nums){

        int res = 0;
        for (int i = 0 ; i < nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }
}
