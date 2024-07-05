package src.leetcode;


import src.intro.Node;

public class lc_2058 {
    public int[] nodesBetweenCriticalPoints(Node head) {
        int[] result = new int[2];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Node current = head;
        Node prev = null;
        Node next = head.next;
        int count = 0;


        result[0] = min;
        result[1] = max;
        return result;
    }

    public static void main(String[] args) {
        //Input: head = [5,3,1,2,5,1,2]
        //Output: [1,3]
        Node head = new Node(5);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next = new Node(2);
        int[] result = new lc_2058().nodesBetweenCriticalPoints(head);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}
