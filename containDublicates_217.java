import java.util.*;

public class containDublicates_217 {

    public static void main(String[] args) {


        int  [] arr = {1,2,3,1};


        System.out.println(isDub(arr));

    }
    public static boolean isDub(int [] nums){

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0 ; i < nums.length; i++){
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);

        }
        return false;
    }
}
