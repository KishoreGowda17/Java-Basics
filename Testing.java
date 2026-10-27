class Testing {

	public int[] smallerNumbersThanCurrent(int[] nums) {
         for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    if (nums[j] < nums[i]) {
                        count++;
                    }
                }
                nums[i] = count;
            }
        }
        return nums;
    }

	public static void main(String[] args) {
		

	}
}