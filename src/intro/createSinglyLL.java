package src.intro;


public class createSinglyLL {

    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }

    static Node insertAtFirst(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    static Node insertAtLast(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = null;
        return head;
    }

    static Node deleteAtFirst(Node head) {
        if (head == null) {
            return null;
        }
        head = head.next;
        return head;
    }

    static Node deleteAtLast(Node head) {
        if (head == null) {
            return null;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return head;
    }

    static Node reverseList(Node head) {
        if (head == null) {
            return null;
        }
        Node current = head;
        Node prev = null;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    //using recursion to reverse the list
    static Node reverseListRec(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseListRec(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        head.next = second;
        Node third = new Node(30);
        second.next = third;
        third.next = new Node(40);
        display(head);
        System.out.println();
//        inserting at the first position
        head = insertAtFirst(head, 50);
        display(head);
        System.out.println();
//        inserting at the last
        head = insertAtLast(head, 61);
        System.out.println();
//        delete at the first node
        head = deleteAtFirst(head);
//        delete the last node
        head = deleteAtLast(head);
        display(head);
        System.out.println("\n After Reversing");
       display(reverseListRec(head));
    }
}
