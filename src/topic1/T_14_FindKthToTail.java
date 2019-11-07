package topic1;

public class T_14_FindKthToTail {
    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k < 1) {
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
