class CountIntegers {

    void printCountOfIntegers(int arr[]) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int num : arr) {

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
    }

    public static void main(String[] args) {

        CountIntegers obj = new CountIntegers();

        int[] arr = { 10, -5, 0, 20, -8, 0, 15, -2 };

        obj.printCountOfIntegers(arr);

    }
}
