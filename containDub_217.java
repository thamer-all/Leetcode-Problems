import java.util.HashSet;

public class containDub_217 {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4};

        System.out.println(containDub(arr));
    }
    public static boolean containDub(int [] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0 ; i < arr.length;i++){
            if (!set.remove(arr[i]))
                set.add(arr[i]);

        }
        return false;
    }
}
