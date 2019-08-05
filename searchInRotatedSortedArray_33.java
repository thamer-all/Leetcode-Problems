public class searchInRotatedSortedArray_33 {

    public static void main(String[] args) {

        int [] arr = {5,6,7,8,1,2,3,4};
        System.out.println(searchInarr(arr,6));

    }
    public static int searchInarr(int[] nums, int target){
        int i = 0  , j = nums.length-1;
        while (i<j){
            int mid = (i+j)/2;
            if (nums[mid] == target) return mid;
            if (nums[mid]> target){
                if (nums[i] <= nums[mid]&& nums[i]>target){
                    i = mid+1;
                }else {
                    j = mid-1;
                }
            }
            else {
                if (nums[j]>= nums[mid]&& nums[j]< target){
                    j = mid-1;
                }else {
                    i = mid+1;
                }
            }
        }
        return -1;
    }
}
