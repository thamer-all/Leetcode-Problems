package Chapter2;
import java.util.*;

public class AddingDotAtTheEnd {

    public static void main(String[] args) {


        Scanner kb = new Scanner(System.in);
        String userCaption;
        int lastIndex;
        char lastChar;

        System.out.print("Enter a caption: ");
        userCaption = kb.next();
        lastIndex = userCaption.length()-1;
        lastChar = userCaption.charAt(lastIndex);

        if((lastChar != '.')&&(lastChar!= '!')){
            userCaption= userCaption +'.';
        }
        System.out.print("New:"+userCaption);

    }
}