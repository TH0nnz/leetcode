import java.util.*;

public interface _14 {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println("花了：" + (System.nanoTime() - time1) + "NS=10^-9秒");
    }

    /***
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     *
     * @param strs
     * @return
     */


    /***
     * 	执行耗时:4 ms,击败了33.54% 的Java用户
     * 	内存消耗:42 MB,击败了55.68% 的Java用户
     * @param strs
     * @return
     */
//    public static String longestCommonPrefix(String[] strs) {
//    int m = strs.length;
//    // 以第一行的列数为基准
//    int n = strs[0].length();

//        for (int col = 0; col < n; col++) { //第一行拿來跑迴圈比對
//        for (int row = 1; row < m; row++) {//跑strs 其他
//            String thisStr = strs[row], prevStr = strs[row - 1];
//            // 判断每个字符串的 col 索引是否都相同
//            if (col >= thisStr.length() || col >= prevStr.length() || thisStr.charAt(col) != prevStr.charAt(col)) {
//                // 发现不匹配的字符，只有 strs[row][0..col-1] 是公共前缀
//                return strs[row].substring(0, col);
//            }
//        }
//    }
//        return strs[0];
//    }


    public static String longestCommonPrefix(String[] strs) {

        int m = strs.length;
        // 以第一行的列数为基准
        int n = strs[0].length();



        for (int col = 0; col < n; col++) { //第一行拿來跑迴圈比對
            for (int row = 1; row < m; row++) {//跑strs 其他
                String thisStr = strs[row], prevStr = strs[row - 1];
                // 判断每个字符串的 col 索引是否都相同
                if (col >= thisStr.length() || col >= prevStr.length() || thisStr.charAt(col) != prevStr.charAt(col)) {
                    // 发现不匹配的字符，只有 strs[row][0..col-1] 是公共前缀
                    return strs[row].substring(0, col);
                }
            }
        }
        return strs[0];
    }
}
