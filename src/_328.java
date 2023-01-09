public interface _328 {//未完成
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        int[] strs = {1, 2, 3, 4, 5};
        ListNode head = creat(strs);
        System.out.println(oddEvenList(head));
        System.out.println("花了：" + (System.nanoTime() - time1) + "NS=10^-9秒");
    }


    public static ListNode oddEvenList(ListNode head) {
        int flag = 0;
    //新增一個陣列
        ListNode nodeStaOdd = new ListNode(0);       //创建首节点
        ListNode nextNodeOdd;                             //声明一个变量用来在移动过程中指向当前节点
        nextNodeOdd = nodeStaOdd;


        ListNode nodeStaEven = new ListNode(0);       //创建首节点
        ListNode nextNodeEven;                             //声明一个变量用来在移动过程中指向当前节点
        nextNodeEven = nodeStaEven;

        //指向首节点
        while (head != null&&head.next!=null) {
            switch (flag % 2) {
                case 0://odd
                    ListNode nodeOdd = new ListNode(head.val);     //生成新的节点
                    nextNodeOdd.next = nodeOdd;                      //把心节点连起来
                    nextNodeOdd = nextNodeOdd.next;                  //当前节点往后移动
                    break;
                case 1://even
                    ListNode nodeEven = new ListNode(head.val);     //生成新的节点
                    nextNodeEven.next = nodeEven;                      //把心节点连起来
                    nextNodeEven = nextNodeEven.next;
                    break;
            }
        }
        nextNodeOdd = nodeStaOdd.next;                     //重新赋值让它指向首节点
        nextNodeEven = nodeStaEven.next;                     //重新赋值让它指向首节点
        nextNodeOdd.next=nextNodeEven;
        return nextNodeOdd;
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
