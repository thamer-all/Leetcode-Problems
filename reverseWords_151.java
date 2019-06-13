public class reverseWords_151 {
    public static void main(String[] args) {
        String a = "thamer loves java";

        System.out.println(reverseWords(a));
    }
    public static String reverseWords(String a){
        a.trim();
        if(a ==null || a.equals("")) return "";
        int end = a.length()-1;
        StringBuilder sb = new StringBuilder();
        while (end > 0){
            while (a.charAt(end) == ' ')end--;
            int index = a.lastIndexOf(' ', end);
            sb.append(a.substring(index+1, end+1));
            sb.append(" ");
            end = index -1;
        }
return sb.toString().substring(0,sb.length()-1);

    }
}
