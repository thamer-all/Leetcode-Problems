import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {
        int[] a = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSum(a, target));
    }

    public static int threeSum(int[] a, int target) {

        int pt1 = 0, pt2 = 0, pt3 = 0;
        Arrays.sort(a);
        int min = a[0] + a[1] + a[a.length - 1];
        for (int i = 0; i < a.length - 2; i++) {
            int start = i + 1;
            int end = a.length - 1;
            pt1 = a[i];
            while (start < end) {
                pt2 = a[start];
                pt3 = a[end];
                int res = pt1 + pt2 + pt3;
                if (res < target)
                    start++;
                else
                    end--;
                if (Math.abs(res - target) < Math.abs(min - target)) {
                    min = res;
                }
            }
        }
        return min;
    }
}
