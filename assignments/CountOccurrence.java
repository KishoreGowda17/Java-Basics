public class CountOccurrence {
    int countOccurence(int arr[], int target) {
        int count = 0;

        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CountOccurrence obj = new CountOccurrence();

        int[] arr = { 10, 20, 10, 30, 10, 40, 20 };
        int target = 10;

        // System.out.println(target + " occurs " + count + " times");

        int result = obj.countOccurence(arr, target);

        System.out.println("Number of times " + target + " has occured is " + result);
    }
}