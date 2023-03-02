package _3_雙指針更多經典習題;


import util.create.ListNode;

import java.util.HashMap;

import static util.create.creatListNode;

/**
 * 1836. 從未排序的鏈表中移除重複元素
 * ＊＊＊這個要收費＊＊＊
 */
public class b_1836 {

    /***
     * Input: head = [1,2,3,2]
     * Output: [1,3]
     *
     * @param args
     */
    public static void main(String[] args) {
        deleteDuplicatesUnsorted(creatListNode(new int[]{1, 2, 3, 2}));
    }

    public static ListNode deleteDuplicatesUnsorted(ListNode head)
    {
        // 先遍歷一遍鏈表，記錄每個值出現的次數
        HashMap<Integer,Integer> count=new HashMap<>();
        ListNode p = head;
        while (p !=null){
            count.put(p.val,count.getOrDefault(p.val,0)+1);
            p=p.next;
        }
        // 虛擬頭結點（哨兵節點），存放結果鏈表
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // 再遍歷一遍節點，把重複出現的節點剔除
        p = dummy;
        while (p !=null){
            // unique 指針負責尋找不重複的節點
            ListNode unique = p.next;
            while (unique != null && count.get(unique.val) > 1) {
                // 跳過重複節點，直到找到不重複的節點
                unique = unique.next;
            }
            // 接入不重複的節點或尾部空指針
            p.next = unique;
            // p 前進，繼續尋找不重複節點
            p = p.next;
        }
        return dummy.next;

    }
}
