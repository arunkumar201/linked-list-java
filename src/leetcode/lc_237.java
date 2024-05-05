package src.leetcode;

import src.intro.Node;

import static src.intro.createSinglyLL.display;

public class lc_237 {
    public void deleteNode(Node thirdNode) {
        // delete the 30 node
        thirdNode.data = thirdNode.next.data;
        thirdNode.next = thirdNode.next.next;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        Node thirdNode = head.next.next;
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        display(head);
        new lc_237().deleteNode(thirdNode);
        System.out.println("\nAfter deleting the 30 node");
        display(head);
    }
}
