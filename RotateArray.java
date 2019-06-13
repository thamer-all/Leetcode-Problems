public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

        rootaion(arr,2);

    }
    public static void rootaion(int[] a, int k){
        k %= a.length;
        reverse(a,0,a.length-1);
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
        for(int i = 0 ; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void reverse(int[] a , int i , int j){
        while (i< j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}
