public class spiralMatrix2 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0 ; i < 3; i++){
            for (int j = 0; j < 3; j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }


    }
    public static int[][] genrateMatrix(int n){
        int[][] ret = new int[n][n];
        int left = 0 , top = 0;
        int  right = n-1,  down = n-1;
        int count = 1;
        while (left <= right) {
            for (int j = left; j <= right; j ++) {
                ret[top][j] = count++;
            }
            top ++;
            for (int i = top; i <= down; i ++) {
                ret[i][right] = count ++;
            }
            right --;
            for (int j = right; j >= left; j --) {
                ret[down][j] = count ++;
            }
            down --;
            for (int i = down; i >= top; i --) {
                ret[i][left] = count ++;
            }
            left ++;
        }
        return ret;
    }
}