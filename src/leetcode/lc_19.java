package src.leetcode;

public class lc_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = head;
        dummy.next = head;
        if ((head == null || head.next == null) && n == 1) {
            return null;
        }
        ListNode prev = dummy;
        ListNode next = dummy;
        int count = 0;

        int size = 0;
        while (temp != null) {
            temp = (ListNode) temp.next;
            size++;
        }


        while (next != null && count <= size - n) {
            prev = next;
            next = (ListNode) next.next;
            count++;
        }

        if (next != null) {
            prev.next = next.next;
        }
        return (ListNode) dummy.next;
    }

    public static void main(String[] args) {
        //Input: head = [1,2,3,4,5], n = 2
        //Output: [1,2,3,5]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
        int n = 1;
        ListNode result = new lc_19().removeNthFromEnd(head, n);
        while (result != null) {
            System.out.println(result.data);
            result = (ListNode) result.next;
        }
    }

}
