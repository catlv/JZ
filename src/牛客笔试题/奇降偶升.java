package 牛客笔试题;

import java.util.Arrays;
import java.util.Collections;

public class 奇降偶升 {
    public Node Res(Node head) {
        if (head == null) {
            return null;
        }
        Node cur1 = head;
        Node cur2 = head.next;
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        int len1;
        int len2;
        if (count % 2 == 0) {
            len1 = count / 2;
            len2 = count / 2;
        } else {
            len1 = (count - 1) / 2;
            len2 = (count + 1) / 2;
        }
        int[] a = new int[len1];
        int[] b = new int[len2];
        for (int i = 0; i < len1; i++) { //奇数
            if (cur2 != null && cur2.next != null) {
                a[i] = cur2.val;
                cur2 = cur2.next.next;
            }
        }

        for (int j = 0; j < len2; j++) { //偶数
            if (cur1 != null && cur1.next != null) {
                b[j] = cur1.val;
                cur1 = cur1.next.next;
            }
        }
//        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(a);
        Arrays.sort(b);
        Node res = new Node(-1);
        Node preNode = res;
        int temp = 0;
        while (temp < len1) {
            preNode.next = new Node(b[temp]);
            preNode = preNode.next;
            preNode.next = new Node(a[temp]);
            temp++;
        }
        if (temp < len2) {
            preNode.next = new Node(b[temp]);
        }
        return res.next;
    }

    public static void main(String[] args) {
        Node head = new Node(8);
        head.next = new Node(1);
        head.next.next = new Node(7);
        head.next.next.next = new Node(2);
        奇降偶升 t = new 奇降偶升();
        Node res = t.Res(head);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
//        System.out.println(res.val);
    }
}

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}