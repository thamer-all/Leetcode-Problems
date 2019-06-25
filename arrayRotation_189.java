public class arrayRotation_189 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7};

        rotation(arr,3);
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void rotation(int [] num, int k){
        k  %= num.length;
        reverse(num,0,num.length-1);
        reverse(num,0,k-1);
        reverse(num,k,num.length-1);

        }
        public static void reverse(int[] num, int i , int j ){
        while (i< j){
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            i++; j--;
        }
    }
}
