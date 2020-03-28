package topic1;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class T_14_FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k < 1) { //这一步判断必不可少，因为后面有写 k - 1
            return null;
        }
        ListNode pre = head;
        ListNode last = head;

        //pre先走k-1步
        for (int i = 0; i < k - 1; i++) {
            if (pre.next != null) {
                pre = pre.next;
            } else {
                return null;
            }
        }

        while (pre.next != null) {
            pre = pre.next;
            last = last.next;
        }
        return last;
    }
}
