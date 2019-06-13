public class TwoSum2_167 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};

       for(int i = 0 ; i < a.length ; i++) {
           System.out.println(twoSum( a, 3));
       }
    }
    public static int[] twoSum(int [] a , int target){
        int start = 0, end = a.length -1, result [] = new int[2];
    // a = [2,7,11,15] , target = 9; output = 1,2 which is the indexes
        while (start != end){
            if(a[start]+a[end] == target){
                result[0] = start +1;
                result[1] = end + 1;
                return result;
            }
            else if(a[start] + a[end] > target ){
                end--;
            } else {
                start++;
            }
        }
        return result;
    }
}
