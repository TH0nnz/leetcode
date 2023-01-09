package _1_鏈表雙指針技巧匯總;

import util.create;
import util.create.ListNode;

public class _141 {

    public static void main(String[] args) {
        System.out.println(hasCycle(create.creatListNodeCycle(new int[]{1, 2, 3, 4, 5, 6})));
    }

    /**
     * 環形鏈表
     *
     * @param
     * @return
     */
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        //注意while中的判斷 因為fast 已經等於null 了 所以fast.next會出錯，位了必免這個情況 一定要將fast的判斷放在前面
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast){
                return true;
            }
        }

        return false;
    }
}
