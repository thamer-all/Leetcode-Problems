public class remove9_660 {
    public static void main(String[] args) {
        int a = 9;
        System.out.println(remove9(a));
    }
    public static int remove9(int a){
        int res = 0 , pow = 1;
        while (a > 0){
            res += a % 9 * pow;
            pow *= 10;
            a /= 9;
        }
        return res;
    }
}
