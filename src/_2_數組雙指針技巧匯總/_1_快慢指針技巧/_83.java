package _2_數組雙指針技巧匯總._1_快慢指針技巧;

import util.create;
import util.create.*;

/**
 * 刪除排序鏈表中的重複元素
 */
public class _83 {

    public static void main(String[] args) {
        deleteDuplicates(create.creatListNode(new int[]{1, 1, 2, 3, 3}));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode slow = head, fast = head;
        while (fast != null) {
            if (fast.val != slow.val) {
                slow.next = fast;

                slow=slow.next;
            }
            fast=fast.next;
        }
        slow.next=null;


        return head;
    }
}
