package util;

public class create {
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode creatListNode(int[] args) {

        ListNode nodeSta = new ListNode(0);    //創建首節點
        ListNode nextNode;                         //聲明一個變量用來在移動過程中指向當前節點
        nextNode = nodeSta;                        //指向首節點
        //因為只有一個節點所以他是一個環
        //創建鏈表
        for (int i = 0; i < args.length; i++) {
            ListNode node = new ListNode(args[i]);  //生成新的節點
            nextNode.next = node;               //把心節點連起來
            nextNode = nextNode.next;           //當前節點往後移動
        } //當for循環完成之後 nextNode指向最後一個節點，

        nextNode = nodeSta.next;                     //重新賦值讓它指向首節點
        return (nextNode);                      //打印輸出

    }


    public static ListNode creatListNodeCycle(int[] args) {

        ListNode nodeSta = new ListNode(0);    //創建首節點
        ListNode nextNode;                         //聲明一個變量用來在移動過程中指向當前節點
        nextNode = nodeSta;                        //指向首節點
        //因為只有一個節點所以他是一個環
        //創建鏈表
        for (int i = 0; i < args.length; i++) {
            ListNode node = new ListNode(args[i]);  //生成新的節點
            nextNode.next = node;               //把心節點連起來
            nextNode = nextNode.next;           //當前節點往後移動
        } //當for循環完成之後 nextNode指向最後一個節點，
        nextNode.next = nextNode;
        nextNode = nodeSta.next;                     //重新賦值讓它指向首節點
        return (nextNode);                      //打印輸出

    }
}
