public class ReverseCharWords_186 {
    public static void main(String[] args) {
        String[] words = {"t", "h", "e", " ", "s", "k", "y", " ", "i", "s", " ", "b", "l", "u", "e"};

        reverseWords(words);

    }

    public static void reverseWords(String[] s) {
        if(s == null || s.length == 0) return;
        swap(s,0,s.length-1);
        int start = 0, end = 0;
        while (end <= s.length){
            if(end == s.length || s[end] == " "){
                swap(s,start,end-1);
                start = ++end;
            } else {
                end++;
            }

        }

        for(int i = 0 ; i < s.length; i++){
            System.out.print(s[i]+" ");
        }
    }
    public static void swap(String [] a , int i , int j){
        while (i < j){
            String temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++; j--;
        }
    }
}
