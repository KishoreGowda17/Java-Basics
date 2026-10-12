package ArrayPractice.IntegerArrayPractice;

public class FindDifference {

    public static int calculateDifference(int nums[]) {
        int diffrence = 0;
        int largest = nums[0];
        int smallest = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            } else  if(nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        diffrence = largest - smallest;

        return diffrence;
    }

    public static void main(String[] args) {
        int array[] = { 5, 13, 20, 6, 4 };

        System.out.println("The difference btw largest and smallest is : " + calculateDifference(array));
    }
}
