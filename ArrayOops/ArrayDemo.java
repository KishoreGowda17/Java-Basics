package ArrayOops;

public class ArrayDemo {

    public static void main(String[] args) {
        MyArray myArray = new MyArray();

        // System.out.println("Initial Array");
        // myArray.printArray();

        myArray.insertAtEnd(10);
        myArray.insertAtEnd(20);
        myArray.insertAtEnd(30);
        myArray.insertAtEnd(40);
        myArray.insertAtEnd(50);

        System.out.println("After inserting ");
        myArray.printArray();

        System.out.println("Delete at End");
        myArray.deleteFromEnd();
        myArray.printArray();

        System.out.println("Delete at Start");
        myArray.deleteFromStart();
        myArray.printArray();

        System.out.println("Delete at Positon");
        myArray.deleteFromAnyPosition(2);
        myArray.printArray();

        // myArray.printArray();

        // myArray.insertAtStart(5);

        // System.out.println("After inserting 5 at start");
        // myArray.printArray();

        // myArray.insertAtPosition(15, 2);

        // System.out.println("After inserting 15 at pos 2");
        // myArray.printArray();

        // myArray.insertAtPosition(100, -1);

        // // System.out.println("After inserting 15 at pos 2");
        // myArray.printArray();

    }

}
