package _3_雙指針更多經典習題;


import java.util.stream.Stream;

/**
 * 264. 丑数 II
 * <p>
 * 标签：数学，链表双指针
 * 给你一个整数 n，请你找出并返回第 n 个 丑数。丑数 就是只包含质因数 2、3 和/或 5 的正整数。
 */
public class c_264 {

    /***
     * 输入：n = 10
     * 输出：12
     * 解释：[1, 2, 3, 4, 5, 6, 8, 9, 10, 12] 是由前 10 个丑数组成的序列。
     *
     * @param args
     */
    public static void main(String[] args) {
        boolean q=false;
        System.out.println(a.valueOf("J"));
        Stream<a> d = Stream.of(a.values());
        d.filter(x -> x.equals("A")).forEach(System.out::println);
//        nthUglyNumber(10);
    }

    public static int nthUglyNumber(int n) {
        int p2 = 1, p3 = 1, p5 = 1;
        return 1;
    }
}

enum a {
    A, B, C
}
