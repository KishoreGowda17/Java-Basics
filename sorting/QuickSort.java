package sorting;

public class QuickSort
{
    //=========================================
    // Function to print the array
    //=========================================
    static void printArray(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //=========================================
    // Partition Function (Hoare Partition)
    //=========================================
    static int partition(int arr[], int low, int high)
    {
        // Select the first element as Pivot
        int pivot = arr[low];

        // i starts from the left
        int i = low;

        // j starts from the right
        int j = high;

        while(i < j)
        {
            // Move i towards right
            // Stop when element becomes greater than Pivot
            while(i <= high && arr[i] <= pivot)
            {
                i++;
            }

            // Move j towards left
            // Stop when element becomes less than or equal to Pivot
            while(arr[j] > pivot)
            {
                j--;
            }

            // Swap misplaced elements
            if(i < j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place Pivot in its correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        // Return Pivot Index
        return j;
    }

    //=========================================
    // Quick Sort Function -- Recursive Calls
    //=========================================
    static void quickSort(int arr[], int low, int high)
    {
        // Base Condition
        if(low < high)
        {
            // Partition the array and get Pivot Index
            int pivotIndex = partition(arr, low, high);

            // Sort Left Subarray
            quickSort(arr, low, pivotIndex - 1);

            // Sort Right Subarray
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    //=========================================
    // Main Function
    //=========================================
    public static void main(String args[])
    {
        int arr[] = {50, 15, 80, 25, 60, 10, 90, 40, 70, 30};

        System.out.println("Before Sorting");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter Sorting");
        printArray(arr);
    }
}
