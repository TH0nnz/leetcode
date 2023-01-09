package _1_鏈表雙指針技巧匯總;

import util.create;
import util.create.ListNode;

public class _160 {

    public static void main(String[] args) {
        System.out.println(getIntersectionNode(create.creatListNode(new int[]{1, 2, 3, 4, 5, 6}), create.creatListNode(new int[]{ 3, 7, 4, 5, 6})));
    }

    /**
     * 兩個鏈表是否相交
     *
     * @param
     * @return
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        while ( p1 != p2) {
            if (p1 == null)
                p1 = headB;
            else
                p1 = p1.next;

            if (p2 == null)
                p2 = headA;
            else
                p2 = p2.next;
        }
        return p1;
    }
}
