import java.sql.Array;
import java.util.*;

public interface _13 {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        System.out.println(romanToInt2("MCMXCIV"));
        System.out.println("花了：" + (System.nanoTime() - time1) + "NS=10^-9秒");

    }

    /***
     * Symbol Value
     * I 1
     * V 5
     * X 10
     * L 50
     * C 100
     * D 500
     * M 1000
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer.
     *
     * Example 1:
     *
     * Input: s = "III"
     * Output: 3
     * Explanation: III = 3.
     * Example 2:
     *
     * Input: s = "LVIII"
     * Output: 58
     * Explanation: L = 50, V= 5, III = 3.
     * Example 3:
     *
     * Input: s = "MCMXCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     */


    /***
     * 解答成功:
     * 	执行耗时:39 ms,击败了5.29% 的Java用户
     * 	内存消耗:50.8 MB,击败了5.98% 的Java用户
     * @param s
     * @return
     */
    public static int romanToInt(String s) {
        String[] arr = s.split("");
        Integer[] sum = new Integer[arr.length];

        for (int i1 = 0; i1 < arr.length; i1++) {
            switch (arr[i1]) {
                case "I":
                    sum[i1] = 1;
                    break;
                case "V":
                    sum[i1] = 5;
                    break;
                case "X":
                    sum[i1] = 10;
                    break;
                case "L":
                    sum[i1] = 50;
                    break;
                case "C":
                    sum[i1] = 100;
                    break;
                case "D":
                    sum[i1] = 500;
                    break;
                case "M":
                    sum[i1] = 1000;
                    break;
            }

        }

        Integer se = sum[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.println(i);
            if (sum[i] > sum[i - 1]) {
                se = se + -sum[i - 1];
            } else {
                se = se + sum[i - 1];
            }
            System.out.println(se);
        }
        return se;
    }


    /***
     * 	执行耗时:28 ms,击败了8.34% 的Java用户
     * 	内存消耗:50 MB,击败了8.42% 的Java用户
     */
    public static int romanToInt1(String s) {
        String lk = s.replace("I", "1,").replace("V", "5,").replace("X", "10,").replace("L", "50,").replace("C", "100,").replace("D", "500,").replace("M", "1000,");
        String[] d = lk.split(",");

        Integer se = Integer.valueOf(d[d.length - 1]);
        for (int i = d.length - 1; i > 0; i--) {
            System.out.println(i);
            if (Integer.valueOf(d[i]) > Integer.valueOf(d[i - 1])) {
                se = se - Integer.valueOf(d[i - 1]);
            } else {
                se = se + Integer.valueOf(d[i - 1]);
            }
            System.out.println(se);
        }
        return se;

    }


    /***
     * 解答成功:
     * 	执行耗时:13 ms,击败了35.46% 的Java用户
     * 	内存消耗:42.9 MB,击败了82.95% 的Java用户
     * @param s
     * @return
     */
    public static int romanToInt2(String s) {
        Map<String, Integer> vmap = new HashMap<String, Integer>();
        vmap.put("I", 1);
        vmap.put("V", 5);
        vmap.put("X", 10);
        vmap.put("L", 50);
        vmap.put("C", 100);
        vmap.put("D", 500);
        vmap.put("M", 1000);


        Integer temp = 0, sum = 0, last = 0;
        String[] arr = s.split("");
        for (int i = s.length() - 1; i >= 0; i--) {
            temp = vmap.get(arr[i]);
            if (temp < last) {
                sum = sum - temp;
            } else {
                sum = sum + temp;
            }
            last = temp;

        }
        return sum;

    }
//
//    public static int romanToInt3(String s) {
//        Map<String, Integer> vmap = new HashMap<String, Integer>();
//        vmap.put("I", 1);
//        vmap.put("V", 5);
//        vmap.put("X", 10);
//        vmap.put("L", 50);
//        vmap.put("C", 100);
//        vmap.put("D", 500);
//        vmap.put("M", 1000);
//
//
//        Integer temp = 0, sum = 0, last = 0;
//        String[] arr = s.split("");
//        for (int i = s.length() - 1; i >= 0; i--) {
//            temp = vmap.get(arr[i]);
//            sum = sum + (temp < last?-1*temp:temp);
//            last = temp;
//
//        }
//        return sum;
//
//    }
}