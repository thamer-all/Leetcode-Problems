import java.util.*;

public class containDub_II_219 {

    public static void main(String[] args) {
        int [] arr = {1,2,3,1};

        System.out.println(isdub(arr,3));

    }
    public static boolean isdub(int[]arr , int  k ){

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0 ; i < arr.length; i++){
            if (i>k)set.remove(i-k-1);
            if (!set.add(arr[i]))return true;
        }
        return false;
    }
}
