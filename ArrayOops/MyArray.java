package ArrayOops;

public class MyArray {
    int array[]; // place to store elements
    int length; // total size of the array
    int rightIndex; // pointing at empty box

    public MyArray() {
        length = 5;
        array = new int[length]; // [0][0][0][0][0] --> initial array
        rightIndex = 0;
    }

    public void printArray() {

        System.out.println("index\tvalue");
        for (int i = 0; i < length; i++) {
            System.out.println(i + "\t" + array[i]);
        }
        System.out.println();
        System.out.println("size : " + rightIndex);
        System.out.println();
    }

    // insert at end
    public void insertAtEnd(int value) {
        if (rightIndex == length) {
            System.out.println("Array is full !!");
            return;
        }

        array[rightIndex] = value;
        rightIndex++; // after inserting at the end size got increased
    }

    public void insertAtStart(int value) {
        if (rightIndex == length) {
            System.out.println("Array is full !!");
            return;
        } else {
            // shift element one position to right
            for (int i = rightIndex - 1; i >= 0; i--) {
                array[i + 1] = array[i];
            }
        }
        array[0] = value;
        rightIndex++;

    }

    public void insertAtPosition(int value, int pos) {
        if (rightIndex == length) {
            System.out.println("Array is full !!");
            return;
        }
        if (pos < 0 || pos > rightIndex) {
            System.out.println("Invalid position");
            return;
        }

        // shift and insert
        for (int i = rightIndex - 1; i >= pos; i--) {
            array[i + 1] = array[i];
        }
        array[pos] = value;
        rightIndex++;

    }

    public void deleteFromEnd() {
        if (rightIndex == 0) {
            System.out.println("Array is empty");
            return;
        }
        array[rightIndex - 1] = 0;
        rightIndex--;
    }

    public void deleteFromStart() {
        if (rightIndex == 0) {
            System.out.println("Array is empty");
            return;
        }

        // shift elements from index = 0

        for (int i = 0; i < rightIndex; i++) {
            array[i] = array[i + 1];
        }
        rightIndex--;
        array[rightIndex] = 0;

    }

    public void deleteFromAnyPosition(int pos) {
        if (pos < 0 || pos > rightIndex) {
            System.out.println("Invalid Position");
            return;
        }

        for (int i = pos; i < rightIndex; i++) {
            array[i] = array[i + 1];
        }
        rightIndex--;
        array[rightIndex] = 0;
    }

}
