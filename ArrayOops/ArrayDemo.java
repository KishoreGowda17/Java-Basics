package ArrayOops;

public class ArrayDemo {

    public static void main(String[] args) {
        MyArray myArray = new MyArray();

        System.out.println("Initial Array");
        myArray.printArray();

        myArray.insertAtEnd(10);
        myArray.insertAtEnd(20);
        
        System.out.println("After inserting 10 and 20 at the end");
        myArray.printArray();

        myArray.insertAtStart(5);

        System.out.println("After inserting 5 at start");
        myArray.printArray();

        myArray.insertAtPosition(15, 2);

        System.out.println("After inserting 15 at pos 2");
        myArray.printArray();

        myArray.insertAtPosition(100, -1);

        // System.out.println("After inserting 15 at pos 2");
        myArray.printArray();

    }

}
