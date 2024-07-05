package src.leetcode;

import src.intro.Node;

public class lc_2181 {
    public Node mergeNodes(Node head) {
        Node dummy = new Node(-1);
        Node dummyHead = dummy;
        Node right = head;
        while (right != null) {
            int middleSum = 0;

            while (right != null && right.data != 0) {
                middleSum += right.data;
                right = right.next;
            }
            if (middleSum != 0) {
                dummyHead.next = new Node(middleSum);
                dummyHead = dummyHead.next;
            }
            if (right != null) {
                right = right.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        //Input: head = [0,1,0,3,0,2,2,0]
        //Output: [1,3,4]
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(0);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(0);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next = new Node(0);
        lc_2181 lc = new lc_2181();
        Node result = lc.mergeNodes(head);
        while (result != null) {
            System.out.println(result.data);
            result = result.next;
        }

    }
}
