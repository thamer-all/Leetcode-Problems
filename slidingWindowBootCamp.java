public class slidingWindowBootCamp {



    public static void main(String[] args) {

        int [] arr = {1, 4, 2, 10, 2, 3, 1, 0, 20};

        System.out.println(sliding(arr,arr.length,4));
    }
    public static int sliding(int [] arr, int n , int k){
    if (n < k){ return -1; }

    int max_Sum = 0;
    for (int i  = 0 ; i < k ; i++){
        max_Sum +=arr[i];
    }
    int windowSum = max_Sum;
    for (int i = k; i < n; i++){
        windowSum += arr[i] - arr[i-k];
        max_Sum = Math.max(max_Sum,windowSum);
    }
        return max_Sum;
    }
}
