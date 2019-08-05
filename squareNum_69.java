public class squareNum_69 {

    public static void main(String[] args) {

        System.out.println(mysqrt(18));
    }
    public static int mysqrt(int x){
        int i = 1 , j = x;
        while (i<=j){
            int mid = (i+j)/2;
            if (mid == x/mid){
                return mid;
            }
            else if (mid < x/mid){
                i = mid+1;
            }else {
                j = mid-1;
            }
        }
        return j;
    }
}
