public class MonotonicArray_896 {
    public static void main(String[] args) {
        int [] a ={1,2,2,3};
        System.out.println(isMonotonic(a));
    }
    public static boolean isMonotonic(int [] a){
        int store = 0;
        for(int i = 0 ; i < a.length -1; ++i){
            int c = Integer.compare(a[i],a[i+1]);
            if(c!= 0){
                if(c != store && store != 0)
                    return false;
                    store = c;

            }
        }
        return true;
    }
}
