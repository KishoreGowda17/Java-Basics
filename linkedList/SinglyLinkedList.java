import java.util.LinkedList;

class SinglyLinkedList {

    public static void main(String[] args) {
        // testInsertAtStart();
        testInsertAtEnd();
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

        // Empty list
        if (currentHead == null) {
            return lastNode;
        }

        Node currentLastNode = currentHead;

        // Find the last node
        while (currentLastNode.next != null) {
            currentLastNode = currentLastNode.next;
        }

        // Connect new node to the last node
        currentLastNode.next = lastNode;

        return currentHead;
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
}
