package _1_鏈表雙指針技巧匯總;

import util.create;
import util.create.ListNode;

public class d_19 {

    public static void main(String[] args) {
        //[1,2,3,4,5], n = 2
        System.out.println(removeNthFromEnd( create.creatListNode(new int[]{1}), 1));
    }



    //TODO 面試題
    // 這個算法是面試常考題，它的時間複雜度是多少呢？
    // 優先隊列 pq 中的元素個數最多是 k，所以一次 poll 或者 add 方法的時間複雜度是 O(logk)；
    // 所有的鏈表節點都會被加入和彈出 pq，所以算法整體的時間複雜度是 O(Nlogk)，其中 k 是鏈表的條數，N 是這些鏈表的節點總數。

    /**
     * 合併 k 個有序鏈表
     *
     * @param
     * @return
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        //注意一定要用虛擬頭 這樣可以省掉很多問題 不信的話你把下面那句改成        ListNode p1 = head, p2 = head;
        ListNode p1 = dummy, p2 = dummy;
        for (int i = 0; i < n; i++) {
            p1 = p1.next;
        }
        while (p1 != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        p2.next = p2.next.next.next;
        return dummy.next;


//        // 虚拟头结点
//        ListNode dummy = new ListNode(-1);
//        dummy.next = head;
//        // 删除倒数第 n 个，要先找倒数第 n + 1 个节点
//        ListNode x = findFromEnd(dummy, n + 1);
//        // 删掉倒数第 n 个节点
//        x.next = x.next.next;
//        return dummy.next;
//    }
//
//    // 返回链表的倒数第 k 个节点
//    static ListNode findFromEnd(ListNode head, int k) {
//        ListNode p1 = head;
//        // p1 先走 k 步
//        for (int i = 0; i < k; i++) {
//            p1 = p1.next;
//        }
//        ListNode p2 = head;
//        // p1 和 p2 同时走 n - k 步
//        while (p1 != null) {
//            p2 = p2.next;
//            p1 = p1.next;
//        }
//        // p2 现在指向第 n - k + 1 个节点，即倒数第 k 个节点
//        return p2;
    }

}
