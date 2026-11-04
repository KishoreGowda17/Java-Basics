package TwoDArrays;

public class TwoDPractice {
    static int calculateSum(int nums[][]) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum += nums[i][j];
            }
        }
        return sum;
    }

    static int getMax(int nums[][]) {
        int max = nums[0][0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (max <= nums[i][j]) {
                    max = nums[i][j];
                }
            }
        }

        return max;
    }

    static int getMin(int nums[][]) {
        int min = nums[0][0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (min >= nums[i][j]) {
                    min = nums[i][j];
                }
            }
        }

        return min;
    }

    static int[] getEvenOddCount(int nums[][]) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        return new int[] { evenCount, oddCount };
    }

    static boolean SearchElement(int nums[][], int key) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }

    static void printDiagonal(int nums[][]) { ;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                if (i == j || j == nums.length - 1 - i) {
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static int[][] scalarMultiply(int nums[][], int scalar) {
        int[][] result = new int[nums.length][];
        for (int i = 0; i < nums.length; i++) {
            result[i] = new int[nums[i].length];
            for (int j = 0; j < nums[i].length; j++) {
                result[i][j] = scalar * nums[i][j];
            }
        }

        return result;
    }

    static int calculateEvenSum(int nums[][]) {
        int evenSum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] % 2 == 0) {
                    evenSum += nums[i][j];
                }
            }

        }

        return evenSum;
    }

    static void calculateSumOfEachRow(int nums[][]) {

        for (int i = 0; i < nums.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < nums[i].length; j++) {
                rowSum += nums[i][j];
            }
            System.out.println("Sum of row " + i + " " + rowSum);
        }
    }

    static void calculateSumOfEachColumn(int nums[][]) {

        for (int j = 0; j < nums[0].length; j++) {
            int columnSum = 0;

            for (int i = 0; i < nums.length; i++) {
                columnSum += nums[i][j];
            }

            System.out.println("Sum of column " + j + " " + columnSum);
        }
    }

    static int calculateSumOfGreaterthan50(int nums[][]) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] >= 50) {
                    sum += nums[i][j];
                }
            }
        }
        return sum;
    }

    static void findMaxInEveryRow(int nums[][]) {
        for (int i = 0; i < nums.length; i++) {
            int max = nums[i][0];

            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] > max) {
                    max = nums[i][j];
                }
            }

            System.out.println("Max of row " + i + " " + max);
        }
    }

    static void findMinEven(int nums[][]) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                if (nums[i][j] % 2 == 0 && nums[i][j] < min) {
                    min = nums[i][j];
                }
            }
        }

        if (min == Integer.MAX_VALUE) {
            System.out.println("No even number found");
        } else {
            System.out.println("Minimum even number: " + min);
        }
    }

    static int[][] multiplyMainDiagonalWith10(int nums[][]) {

        int[][] result = new int[nums.length][nums[0].length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i == j)
                    result[i][j] = nums[i][j] * 10;
                else
                    result[i][j] = nums[i][j];
            }
        }

        return result;
    }

    static int countOccurance(int nums[][], int key) {

        int count = 0;

        for (int[] x : nums) {
            for (int y : x) {
                if (y == key)
                    count++;
            }
        }

        return count;
    }

    static boolean searchElementInMainDiagonal(int nums[][], int key) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i][i] == key)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[][] = { { 3, 5, 9 }, { 7, 6, 2 }, { 4, 8, 1 } };

        // System.out.println(calculateSum(arr));

        // ---------Max--------------------
        // int result = getMax(arr);
        // System.out.println(result);
        // --------------------------------------

        // ---------Min----------------------
        // int result = getMin(arr);
        // System.out.println(result);

        // ---------Even Odd Count----------
        // int result[] = getEvenOddCount(arr);
        // System.out.println("Even Count = " + result[0]);
        // System.out.println("Odd Count = " + result[1]);

        // ----------Search Element-----------
        // boolean result = SearchElement(arr, 9);
        // if (result) {
        // System.out.println("Element exists");
        // } else {
        // System.out.println("Element doesn't exists");
        // }

        // ---------Diagonal-----------------
        // printDiagonal(arr);

        // ----------Scalar Multiplication-------
        // int result[][] = scalarMultiply(arr, 2);
        // for (int i = 0; i < result.length; i++) {
        // for (int j = 0; j < result[i].length; j++) {
        // System.out.print(result[i][j]+" ");
        // }
        // System.out.println("\n");
        // }

        // ------Even Multiplication---------
        // System.out.println(calculateEvenSum(arr));

        // -------Sum of each row----------
        // calculateSumOfEachRow(arr);

        // -------Sum of each column--------
        // calculateSumOfEachColumn(arr);

        // -------Sum of elements greater than 50--------
        // int arr2[][] = { { 30, 50, 90 }, { 70, 60, 20 }, { 40, 80, 10 } };
        // int result = calculateSumOfGreaterthan50(arr2);
        // System.out.println(result);

        // -------Find max in every row--------
        // findMaxInEveryRow(arr);

        // --------find min even-------
        // findMinEven(arr);

        // -------Multiply main diagonal by 10--------
        // int res[][] = multiplyMainDiagonalWith10(arr);
        // for (int i = 0; i < res.length; i++) {
        // for (int j = 0; j < res[i].length; j++) {
        // System.out.print(res[i][j] + " ");
        // }
        // System.out.println();
        // }

        // -------- Count occurence--------
        // int arr3[][] = { { 4, 5, 9 }, { 7, 4, 2 }, { 4, 8, 1 } };
        // int key = 4;
        // int res = countOccurance(arr3, key);
        // System.out.println("The Number of times " + key + " has appered in the array
        // is : " + res);

        // -------Search element in main diagonal-----
        int key = 3;
        System.out.println(searchElementInMainDiagonal(arr, key));
        
    }
}
