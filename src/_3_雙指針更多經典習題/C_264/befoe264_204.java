package _3_雙指針更多經典習題.C_264;

import util.create;

import java.util.Arrays;

/***
 * 204  計數質數
 * 264的前導題
 * 在大於1的自然数中，除了1和該数自身外，無法被其他自然数整除的数
 */
public class befoe264_204 {
    /***
     * Input: n = 10
     * Output: 4
     * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
     */
    public static void main(String[] args) {
        //[1,2,3,4,5], n = 2
        System.out.println(countPrimes(10));
    }


    static int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        // 將數組都初始化為 true
        Arrays.fill(isPrime, true);
        // 找誰被2整除 被3整除 被5整除
        //小於10之正整數的質數
        //[   0,    1,    2,    3,     4,    5,     6,    7,     8,     9]
        //[true, true, true, true, false, true, false, true, false, false]
        for (int i = 2; i *i< n; i++)
            if (isPrime[i])
                // i 的倍數不可能是質數了
                for (int j = i * i; j < n; j += i)
                    // 4 6 8
                    isPrime[j] = false;

        int count = 0;
        for (int i = 2; i < n; i++)
            if (isPrime[i]) count++;

        return count;
    }

}
