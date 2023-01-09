import java.util.HashMap;

public class _9 {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        System.out.println(isPalindrome(1212112121));
        System.out.println("花了：" + (System.nanoTime()-time1) + "NS=10^-9秒");

    }

    /***
     * 解答成功:
     * 	执行耗时:60 ms,击败了6.79% 的Java用户
     * 	内存消耗:53.9 MB,击败了5.28% 的Java用户
     * @param x
     * @return
     */
//    public static boolean isPalindrome(int x) {
//        if (x < 0) return false;
//        String[] arr = String.valueOf(x).split("");
//        boolean targe = true;
//        for (int i = 0; i < arr.length; i++) {
//            if (!(arr[i].equals(arr[arr.length - 1 - i]))) {
//                targe = false;
//            }
//            if (!targe) return false;
//        }
//        return true;
//    }


    /***
     * 解答成功:
     * 	执行耗时:16 ms,击败了52.32% 的Java用户
     * 	内存消耗:44.5 MB,击败了59.90% 的Java用户
     */
    public static boolean isPalindrome(int x) {

        if (x < 0) return false;
        int temp = x;
        int y = 0;
        int lastNum;
        while (temp > 0) {
            lastNum = temp % 10;
            temp = temp / 10;
            y = y * 10 + lastNum;
        }
        return x == y;
    }

}
