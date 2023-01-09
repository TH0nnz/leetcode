package TEST;

import java.util.PriorityQueue;

public class TEST_PriorityQueue {
    public static void main(String[] args) {
        Integer[] test = {4, 8, 3, 6, 9, 4, 7, 8, 3};
        PriorityQueue<Integer> pq = new PriorityQueue<>(test.length, (a, b) -> (a - b));
        //a - b => [3, 3, 4, 6, 9, 4, 7, 8, 8]
        //b - a => [9, 8, 7, 8, 6, 3, 4, 4, 3]
        for (Integer integer : test) {
            if (integer != null) {
                pq.add(integer);
            }
        }


        System.out.println(pq.toString());
    }
}
