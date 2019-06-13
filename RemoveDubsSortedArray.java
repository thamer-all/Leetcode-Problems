public class RemoveDubsSortedArray {
    public static void main(String[] args) {
        int [] arr = {2,5,5,6,6,11};


        System.out.println(RemoveDubs(arr));
    }
    // Remove Dubs From Sorted Array
    public static int RemoveDubs(int [] a) {
        int start = 0; 
        for(int i = 1 ; i < a.length;i++){
            if(a[i] != a[start]){
                start++;
                a[start] = a[i];
            }
        }
        return start+1;
    }

}
