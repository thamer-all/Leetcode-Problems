import java.util.ArrayList;
import java.util.HashSet;

public class removeDubArrayList {
    public static void main(String[] args) {

        int a[] = {1, 1, 2, 2, 3, 4, 4};

        System.out.println(removeDubs(a));
    }

    public static int removeDubs(int[] a) {

        int start = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[start] != a[i]) {
                start++;
                a[start] = a[i];
            }
        }
        return start + 1;
    }
}
