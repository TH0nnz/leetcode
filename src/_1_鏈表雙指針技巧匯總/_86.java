package _1_鏈表雙指針技巧匯總;

public class _86 {

    public static void main(String[] args) {
        System.out.println(partition(creat(new int[]{1, 4, 3, 2, 5, 2}), 3));
    }

    /***
     * 分解鏈表
     *
     * @param head
     * @param x
     * @return
     */
    public static ListNode partition(ListNode head, int x) {
//        dummy1 dummy2 虛擬頭
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode p1 = dummy1, p2 = dummy2, p = head;
        while (p != null) {
            if (p.val >= x) {
                p2.next = p;
                p2 = p2.next;
            } else {
                p1.next = p;
                p1 = p1.next;
            }
            ListNode temp = p.next;
            p.next = null;
            p = temp;

        }

//        此時的p1 指向dummy1 這個小鏈表的最後一個節點 此時的p2 指向dummy2 這個小鏈表的最後一個節點
//        將p1指針指到的節點 的next指向 dummy2這個虛擬頭的next
        p1.next = dummy2.next;
        return dummy1.next;
    }

    public static class ListNode {
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

    public static ListNode creat(int[] args) {

        ListNode nodeSta = new ListNode(0);    //创建首节点
        ListNode nextNode;                         //声明一个变量用来在移动过程中指向当前节点
        nextNode = nodeSta;                        //指向首节点
        //因為只有一個節點所以他是一個環
        //创建链表
        for (int i = 0; i < args.length; i++) {
            ListNode node = new ListNode(args[i]);  //生成新的节点
            nextNode.next = node;               //把心节点连起来
            nextNode = nextNode.next;           //当前节点往后移动
        } //当for循环完成之后 nextNode指向最后一个节点，

        nextNode = nodeSta.next;                     //重新赋值让它指向首节点
        return (nextNode);                      //打印输出

    }
}
