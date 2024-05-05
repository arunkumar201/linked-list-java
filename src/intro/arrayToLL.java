package src.intro;

import static src.intro.createSinglyLL.display;

public class arrayToLL {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int num : arr) {
            temp.next = new Node(num);
            temp = temp.next;
        }
        display(head);
    }
}
