package topic2;

/**
 * getLoopNode：得到环的入口节点
 * noLoop：两链表都无环时的第一个公共节点
 * bothLoop：两链表都有环时的第一个公共节点
 */
public class T_36_FindFirstComNodeWithLoop {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        ListNode loop1 = getLoopNode(pHead1);
        ListNode loop2 = getLoopNode(pHead2);
        if (loop1 == null && loop2 == null) {
            return noLoop(pHead1, pHead2);
        }
        if (loop1 != null && loop2 != null) {
            return bothLoop(pHead1, loop1, pHead2, loop2);
        }
        return null;
    }

    private ListNode getLoopNode(ListNode pHead) {
        if (pHead == null || pHead.next == null || pHead.next.next == null) {
            return null;
        }
        ListNode n1 = pHead.next;
        ListNode n2 = pHead.next.next;
        while (n1 != n2) {
            if (n2.next == null || n2.next.next == null) {
                return null;
            }
            n1 = n1.next;
            n2 = n2.next.next;
        }
        n2 = pHead;
        while (n1 != n2) {
            n1 = n1.next;
            n2 = n2.next;
        }
        return n1;
    }

    private ListNode noLoop(ListNode pHead1, ListNode pHead2) {
        ListNode cur1 = pHead1;
        ListNode cur2 = pHead2;
        int n = 0;
        while (cur1.next != null) {
            cur1 = cur1.next;
            n++;
        }
        while (cur2.next != null) {
            cur2 = cur2.next;
            n--;
        }
        if (cur1 != cur2) {
            return null;
        }
        cur1 = n > 0 ? pHead1 : pHead2;
        cur2 = cur1 == pHead1 ? pHead2 : pHead1;
        n = Math.abs(n);
        while (n != 0) {
            cur1 = cur1.next;
            n--;
        }
        while (cur1 != cur2) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }

    private ListNode bothLoop(ListNode pHead1, ListNode loop1, ListNode pHead2, ListNode loop2) {
        ListNode cur1 = null;
        ListNode cur2 = null;
        if (loop1 == loop2) { //先相交，在共享同一个环
            cur1 = pHead1;
            cur2 = pHead2;
            int n = 0;
            while (cur1 != loop1) {
                cur1 = cur1.next;
                n++;
            }
            while (cur2 != loop2) {
                cur2 = cur2.next;
                n--;
            }
            cur1 = n > 0 ? pHead1 : pHead2;
            cur2 = cur1 == pHead1 ? pHead2 : pHead1;
            n = Math.abs(n);
            while (n != 0) {
                cur1 = cur1.next;
                n--;
            }
            while (cur1 != cur2) {
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
            return cur1;
        } else {
            cur1 = loop1.next;
            while (cur1 != loop1) {
                if (cur1 == loop2) { //在环的某处相遇
                    return loop1;
                }
                cur1 = cur1.next;
            }
            return null; //各自成环
        }
    }
}
