import java.util.LinkedList;

class SinglyLinkedList {

    public static void main(String[] args) {
        System.out.println();
        // testDeleteAtStart();
        testDeleteAtKeyNode();
    }

    public static void testInsertAtStart() {
        Node head = null;
        // insert At Start
        head = insertAtStart(101, head);
        head = insertAtStart(102, head);
        head = insertAtStart(103, head);
        head = insertAtStart(104, head);
        head = insertAtStart(105, head);
        head = insertAtStart(106, head);
        printList(head);

    }

    public static void testInsertAtEnd() {
        Node head = null;

        head = insertAtEnd(200, head);
        head = insertAtEnd(400, head);
        head = insertAtEnd(600, head);
        head = insertAtEnd(800, head);

        printList(head);

    }

    public static Node insertAtStart(int value, Node currentHead) {

        Node newNode = new Node();
        newNode.data = value;

        if (currentHead != null) // one or more nodes exist in the list newNode.next = currentHead;
            newNode.next = currentHead;
        return newNode;
    }

    public static Node insertAtEnd(int value, Node currentHead) {

        Node lastNode = new Node();
        lastNode.data = value;
        lastNode.next = null;

        if (currentHead == null) {
            return lastNode;
        }

        Node currentLastNode = currentHead;

        while (currentLastNode.next != null) {
            currentLastNode = currentLastNode.next;
        }

        currentLastNode.next = lastNode;

        return currentHead;
    }

    public static void insertAfterKey(Node head, int key, int value) {

        if (head == null)
            return;

        Node keyNode = head;

        while (keyNode != null && keyNode.data != key) {
            keyNode = keyNode.next;
        }

        if (keyNode == null) {
            System.out.println("Key not found");
            return;
        }

        Node newNode = new Node();
        newNode.data = value;

        newNode.next = keyNode.next;
        keyNode.next = newNode;
    }

    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data);
            System.out.print(" -> ");

            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void testDeleteAtStart() {
        Node head = null;

        // Empty list
        head = deleteAtEnd(head);

        // one node
        System.out.println("before Delete");
        head = insertAtEnd(10, head);
        printList(head);
        System.out.println();
        System.out.println("After delete");
        head = deleteAtEnd(head);
        printList(head);
        System.out.println();

        // more than 1 node
        System.out.println("Before delete");
        head = insertAtEnd(10, head);
        head = insertAtEnd(20, head);
        head = insertAtEnd(30, head);
        head = insertAtEnd(40, head);
        printList(head);
        System.out.println();

        System.out.println("After delete");
        head = deleteAtEnd(head);

        printList(head);
    }

    public static void testDeleteAtKeyNode() {
        Node head = null;

        // Empty list
        head = deleteKeyNode(head, 10);

        // one node
        System.out.println("before Delete");
        head = insertAtEnd(10, head);
        printList(head);
        System.out.println();
        System.out.println("After delete");
        head = deleteKeyNode(head,10);
        printList(head);
        System.out.println();

        // more than 1 node
        System.out.println("Before delete");
        head = insertAtEnd(10, head);
        head = insertAtEnd(20, head);
        head = insertAtEnd(30, head);
        head = insertAtEnd(40, head);
        printList(head);
        System.out.println();

        System.out.println("After delete");
        head = deleteKeyNode(head,30);

        printList(head);
    }

    public static Node deleteAtStart(Node head) {
        // list is empty
        if (head == null) {
            System.out.println("List is empty");
            System.out.println();
            return null;
        }

        // one or many nodes in list
        return head.next;
    }

    public static Node deleteAtEnd(Node head) {
        if (head == null || head.next == null) {
            System.out.println("empty list");
            return null;
        }
        Node lastButOne = head;
        while (lastButOne.next.next != null) {
            lastButOne = lastButOne.next;
        }
        lastButOne.next = null;
        return head;
    }

    public static Node deleteKeyNode(Node head, int key) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        if (head.data == key)
            return head.next;

        Node prevNode = head;
        Node keyNode = head.next;

        while (keyNode != null) {
            if (keyNode.data == key)
                break;

            prevNode = keyNode;
            keyNode = keyNode.next;
            if (keyNode != null && keyNode.data == key) {
                prevNode.next = keyNode.next;
            }

        }
        return head;

    }

}
