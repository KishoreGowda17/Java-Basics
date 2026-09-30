import java.util.LinkedList;

class SinglyLinkedList {

    public static void main(String[] args) {

        Node head = null;

        head = insertAtStart(101, head);
        head = insertAtStart(202, head);
        head = insertAtStart(303, head);
        head = insertAtStart(404, head);
        head = insertAtStart(505, head);
        head = insertAtStart(606, head);
        head = insertAtStart(707, head);

        printList(head);
    }

    public static Node insertAtStart(int value, Node currentHead) {

        Node newNode = new Node();

        newNode.data = value;
        if (currentHead != null) // one or more nodes exist in the list newNode.next = currentHead;
            newNode.next = currentHead;
        return newNode;
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
