package _1_鏈表雙指針技巧匯總;

public interface a_21 {
    public static void main(String[] args) {

        String str1 = "1, 2, 4";
        String str2 = "1, 3, 4";
        //自己的測資自己做
        ListNode ln1 = creat(str1.replaceAll(" ", ""));
        ListNode ln2 = creat(str2.replaceAll(" ", ""));

        long time1 = System.nanoTime();


        System.out.println(mergeTwoLists(ln1, ln2));
        System.out.println("花了：" + (System.nanoTime() - time1) + "NS=10^-9秒");
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */


    /**
     * 合併鏈表
     *
     * 解答成功:
     * 	執行耗時:0 ms,擊敗了100.00% 的Java用戶
     * 	內存消耗:41.5 MB,擊敗了98.60% 的Java用戶
     * @param list1
     * @param list2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 虛擬頭結點
        ListNode dummy = new ListNode(-1), p = dummy;
        ListNode p1 = list1, p2 = list2;

        while (p1 != null && p2 != null) {
            // 比較 p1 和 p2 兩個指針
            // 將值較小的的節點接到 p 指針
            if (p1.val > p2.val) {
                p.next = p2;
                p2 = p2.next;
            } else {
                p.next = p1;
                p1 = p1.next;
            }
            // p 指針不斷前進
            p = p.next;
        }

        if (p1 != null) {
            p.next = p1;
        }

        if (p2 != null) {
            p.next = p2;
        }

        return dummy.next;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode creat(String args) {

        ListNode nodeSta = new ListNode(0);    //創建首節點
        ListNode nextNode;                         //聲明一個變量用來在移動過程中指向當前節點
        nextNode = nodeSta;                        //指向首節點
        //因為只有一個節點所以他是一個環
        String[] arr = args.split(",");
        //創建鏈表
        System.out.println(Integer.parseInt(arr[0]));
        for (int i = 0; i < arr.length; i++) {
            ListNode node = new ListNode(Integer.parseInt(arr[i]));  //生成新的節點
            nextNode.next = node;               //把心節點連起來
            nextNode = nextNode.next;           //當前節點往後移動
        } //當for循環完成之後 nextNode指向最後一個節點，

        nextNode = nodeSta.next;                     //重新賦值讓它指向首節點
        return (nextNode);                      //打印輸出

    }
}
