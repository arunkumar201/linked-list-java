package src.leetcode;

import static src.intro.createSinglyLL.display;

public class lc_2487 {

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;
        while (current != null) {
            next = (ListNode) current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public ListNode removeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode src = dummy;
        ListNode temp = reverseList(head);
        int max = Integer.MIN_VALUE;
        while (temp != null) {
            if (temp.data >= max) {
                src.next = new ListNode(temp.data);
                src = (ListNode) src.next;
            }
            max = Math.max(temp.data, max);
            temp = (ListNode) temp.next;
        }
        return  reverseList((ListNode) dummy.next);
    }

    public static void main(String[] args) {
//        Input: head = [5,2,13,3,8]
        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);

        ListNode ans = new lc_2487().removeNodes(head);
        //display the ans
        display(ans);
    }
}
