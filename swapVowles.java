public class swapVowles {


        public static void main(String[] args) {
            int [] a = {1,1,1,1,1,2};

            System.out.println(RemoveDubs(a));


        }
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
