
public class SinglyLinkedList {

    public static void main(String[] args) {

        Node first = new Node();
        Node second = new Node();

        first.data = 101;
        second.data = 102;

        first.next = second;

        System.out.println(first.data);
        System.out.println(first.next.data);

    }
}
