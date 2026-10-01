import java.util.LinkedList;

class SinglyLinkedList {

    public static void main(String[] args) { 
        // testInsertAtStart();
        // testInsertAtEnd();

        insertAfterKey(null, 5, 10);

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
}
