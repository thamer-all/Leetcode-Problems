public class LongestSubStringPlindrum {
    public static void main(String[] args) {
        String a = "aaaabaaa";
        System.out.println(longestPalindrome(a));

    }
    public static String longestPalindrome(String s){
        int[][] dp = new int[s.length()][s.length()];

        for (int i = s.length() - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        s += " "+ dp[0][s.length()-1];
        return s;

    }
}
