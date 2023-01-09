package _1_鏈表雙指針技巧匯總;

import java.util.PriorityQueue;

import util.create.*;

import static util.create.creatListNode;

public class _23 {

    public static void main(String[] args) {
        //[[1,4,5],[1,3,4],[2,6]]
        ListNode[] lists = {creatListNode(new int[]{1, 4, 5}), creatListNode(new int[]{1, 3, 4}), creatListNode(new int[]{2, 6})};
        System.out.println(mergeKLists(lists));
    }


    //TODO 面試題
    // 這個算法是面試常考題，它的時間複雜度是多少呢？
    // 優先隊列 pq 中的元素個數最多是 k，所以一次 poll 或者 add 方法的時間複雜度是 O(logk)；
    // 所有的鏈表節點都會被加入和彈出 pq，所以算法整體的時間複雜度是 O(Nlogk)，其中 k 是鏈表的條數，N 是這些鏈表的節點總數。

    /**
     * 合併 k 個有序鏈表
     *
     * @param lists
     * @return
     */
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        // 虛擬頭結點
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        // 優先級隊列，最小堆
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                lists.length, (a, b) -> (a.val - b.val));
        //放到優先隊列內 便會自己排序 ListNode[] lists
        // 三個陣列就會輪三次，注意這只有在排頭節點
        for (ListNode head : lists) {
            if (head != null)
                pq.add(head);
        }
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            //p.next 是指 p中的next要指向到node
            p.next = node;
            if (node.next != null)
                //將取過的頭節點的下一節點放到優先隊列中繼續排列
                pq.add(node.next);
            //p的指向要直接指到p的next中 此時是指到node上 所以指針往下走了一個節點
            p = p.next;
        }


        return dummy.next;
    }


}
