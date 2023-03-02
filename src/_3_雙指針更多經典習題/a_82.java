package _3_雙指針更多經典習題;


import util.create.*;

import static util.create.creatListNode;

/**
 * 82. 刪除排序鏈表中的重複元素 II
 */
public class a_82 {

    /***
     * Input: head = [1,2,3,3,4,4,5]
     * Output: [1,2,5]
     *
     * @param args
     */
    public static void main(String[] args) {
        deleteDuplicates(creatListNode(new int[]{1, 2, 3, 3, 4, 4, 5}));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy, q = head;
        while (q != null) {
            if (q.next != null && q.val == q.next.val) {
                //如果條件還是符合 繼續往下一位運行
                while (q.next != null && q.val == q.next.val) {
                    q = q.next;
                }
                //當下一值不等於前一值時跳出，注意此時的前一直也是重複過的所以q=q.next;
                q = q.next;
                //然後交由else處理

                if (q.next == null) {
                    p.next = null;
                }
            } else {
                p.next = q;
                p = p.next;
                q = q.next;
            }
        }
        return dummy.next;
    }
}
