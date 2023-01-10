package _2_數組雙指針技巧匯總._2_左右指針的常用算法._4_迴文串判斷;


/***
 * 迴文串就是正着讀和反着讀都一樣的字符串
 */
public class _5 {
    public static void main(String[] args) {
        longestPalindrome("cbbd");

    }

    public static String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String odd = palindrome(s, i, i);
            String even = palindrome(s, i, i + 1);

            res=res.length()>odd.length()?res:odd;
            res=res.length()>even.length()?res:even;

        }

        return res;
    }

    public static String palindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }

}
