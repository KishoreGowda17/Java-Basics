public class MaxTwoMinTwo {
    public static void main(String[] args) {

        int[] arr = {1000,2000,-100,-200,18,43};

        int MaxFirst = arr[0];
        int MaxSecond = arr[0];

        int MinFirst = arr[0];
        int MinSecond = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];

            if (current != MaxFirst) {
                if (current > MaxFirst) {
                    MaxSecond = MaxFirst;
                    MaxFirst = current;
                } else if (current > MaxSecond) {
                    MaxSecond = current;
                }
            }

            if (current != MinFirst) {
                if (current < MinFirst) {
                    MinSecond = MinFirst;
                    MinFirst = current;
                } else if (current < MinSecond) {
                    MinSecond = current;
                }
            }
        }

        System.out.println("MaxFirst  = " + MaxFirst);
        System.out.println("MaxSecond = " + MaxSecond);
        System.out.println("MinFirst  = " + MinFirst);
        System.out.println("MinSecond = " + MinSecond);
    }
}