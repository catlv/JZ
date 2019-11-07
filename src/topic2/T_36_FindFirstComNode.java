package topic2;

import java.util.HashMap;

public class T_36_FindFirstComNode {
    //长度不同有公共结点，第一遍差值出来，第二遍一起到公共结点
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1 != p2) {
            p1 = (p1 != null ? p1.next : pHead2);
            p2 = (p2 != null ? p2.next : pHead1);
        }
        return p1;
    }

    //HashMap法
    public ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2) {
        HashMap<ListNode, Integer> hashMap = new HashMap<>();
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1 != null) {
            hashMap.put(p1, null);
            p1 = p1.next;
        }
        while (p2 != null) {
            if (hashMap.containsKey(p2)) {
                return p2;
            } else {
                p2 = p2.next;
            }
        }
        return null;
    }

    public ListNode FindFirstCommonNode3(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        ListNode cur1 = pHead1;
        ListNode cur2 = pHead2;
        int n = 0;
        while (cur1.next != null) {
            n++;
            cur1 = cur1.next;
        }
        while (cur2.next != null) {
            n--;
            cur2 = cur2.next;
        }
        if (cur1 != cur2) {
            return null;
        }
        cur1 = n > 0 ? pHead1 : pHead2;
        cur2 = cur1 == pHead1 ? pHead2 : pHead1;
        n = Math.abs(n);
        while (n != 0) {
            n--;
            cur1 = cur1.next;
        }
        while (cur1 != cur2) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}