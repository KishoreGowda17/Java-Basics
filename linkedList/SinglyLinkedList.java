class SinglyLinkedList {

    public static void main(String[] args) {

        Node head = null;

        head = insertAtStart(101, head);
        head = insertAtStart(202, head);
        head = insertAtStart(303, head);
        head = insertAtStart(404, head);

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

        Node monkey = head;

        while (monkey != null) {

            System.out.print(monkey.data);
            System.out.print(" -> ");

            monkey = monkey.next;
        }

        System.out.println("null");
    }
}
