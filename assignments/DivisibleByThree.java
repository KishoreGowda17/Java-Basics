public class DivisibleByThree {

    void printMultiples(int arr[]) {
        for (int num : arr) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        DivisibleByThree obj = new DivisibleByThree();

        int[] arr = { 3, 7, 9, 12, 14, 18, 20, 21 };

        obj.printMultiples(arr);
        
    }
}