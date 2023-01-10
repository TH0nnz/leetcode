package _2_數組雙指針技巧匯總._2_左右指針的常用算法._3_反轉數組;

public class _344 {

    public static void main(String[] args) {
        reverseString(new char[]{'H','a','n','n','a','h'});
    }

    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println(s.toString());

    }
}
