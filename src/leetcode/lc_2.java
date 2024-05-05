package src.leetcode;

import static src.intro.createSinglyLL.display;

public class lc_2 {

    public static void addTwoNumbers(ListNode l1, ListNode l2) {

    }

    public static void main(String[] args) {
//        Input: l1 = [2,4,3], l2 = [5,6,4]
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        addTwoNumbers(l1, l2);
        display(l1);

    }
}


