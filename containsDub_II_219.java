import java.util.*;

public class containsDub_II_219 {

    public static void main(String[] args) {

        int [] nums = {1,2,3,1};

    }
    public static boolean containsNearbyDub(int [] nums, int k){

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0 ; i < nums.length; i++){
            if (i > k) set.remove(nums[i-k-1]);
            if (!set.add(nums[i])) return true;
        }
        return false;
    }
}
