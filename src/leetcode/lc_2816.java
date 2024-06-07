package src.leetcode;

import static src.intro.createSinglyLL.display;

public class lc_2816 {

    public ListNode reverseLL(ListNode head) {
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

    public ListNode doubleIt(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = reverseLL(head);
        ListNode src = dummy;
        int carry = 0;
        while (temp != null) {
            int currValue = temp.data * 2 + carry;
            carry = currValue / 10;
            currValue = currValue % 10;
            src.next = new ListNode(currValue);
            src = (ListNode) src.next;
            temp = (ListNode) temp.next;
        }
        if(carry>0){
            src.next = new ListNode(carry);
        }
        return reverseLL((ListNode) dummy.next);
    }

    public static void main(String[] args) {
//        Input: head = [1,8,9]
        ListNode head = new ListNode(1);
        head.next = new ListNode(8);
        head.next.next = new ListNode(9);

        ListNode ans = new lc_2816().doubleIt(head);
        //display the ans
        display(ans);
    }
}
