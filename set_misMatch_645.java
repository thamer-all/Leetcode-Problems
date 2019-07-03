public class set_misMatch_645 {

    public static void main(String[] args) {

        int [] a = {3,0,1};

        System.out.println(findError(a));
    }
    public static int findError(int [] arr){

        int missing = arr.length;
        for (int i = 0 ; i < arr.length; i++){
            missing ^= i ^arr[i];

        }

        return missing;
    }
}
