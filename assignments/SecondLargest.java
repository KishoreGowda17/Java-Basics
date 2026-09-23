public class SecondLargest {

    public void findSecondLargest(int[] arr) {

        int largest;
        int secondLargest;

        if (arr[0] > arr[1]) {
            largest = arr[0];
            secondLargest = arr[1];
        } else {
            largest = arr[1];
            secondLargest = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }

    public static void main(String[] args) {

        int[] arr = { 10, 25, 8, 40, 30 };

        SecondLargest obj = new SecondLargest();
        obj.findSecondLargest(arr);
    }
}