import java.util.HashMap;

public interface _9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    /***
     * 解答成功:
     * 	执行耗时:60 ms,击败了6.79% 的Java用户
     * 	内存消耗:53.9 MB,击败了5.28% 的Java用户
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        String[] arr = String.valueOf(x).split("");
        boolean targe = true;
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i].equals(arr[arr.length - 1 - i]))) {
                targe = false;
            }
            if (!targe) return false;
        }
        return true;
    }

}
