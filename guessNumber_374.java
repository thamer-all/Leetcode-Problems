import com.intellij.codeInsight.template.macro.GuessElementTypeMacro;

public class guessNumber_374 {

    public static void main(String[] args) {

    }
    static int guess(int n){

        return n;
    }


    public static int guessNum(int n ){

        int i = 1, j = n;
        while(i < j) {
            int mid = i + (j - i) / 2;
            if(guess(mid) == 0) {
                return mid;
            } else if(guess(mid) == 1) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return i;
    }
}
