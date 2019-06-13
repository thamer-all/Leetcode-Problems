public class ValidPlandrumString {
    public static void main(String[] args) {
        String a = "A man, a plan, a canal: Panama";
        System.out.println(isPlaindrome(a));
    }

    public static boolean isPlaindrome(String s) {
        if(s == null || s.length() == 0) {return  true;}
        int  head = 0 , tail = s.length() -1;
        char cHead , cTail;
        while (head <= tail){
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if(!Character.isLetterOrDigit(cHead)){
                head++;
            } else if(!Character.isLetterOrDigit(cTail)){
                tail--;
            }else{
                if(Character.toLowerCase(cHead) != Character.toLowerCase(cTail)){
                    return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }
}
