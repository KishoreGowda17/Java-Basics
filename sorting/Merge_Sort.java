package sorting;

public class Merge_Sort {
    static void mergeSort(int arr[], int l, int h) {
        if (l >= h)
            return;

        int mid = l + (h - l) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, h);
        merge(arr, l, mid, h);
    }

    static void merge(int arr[], int l, int mid, int h) {
        int temp[] = new int[h - l + 1];
        int i = l;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= h) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++; 
        }
        // copying elements
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= h) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (int x = 0; x < temp.length; x++) {
            arr[l + x] = temp[x];
        }
    }

    static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,4,2,1,5,1,23,45,24,2145,462,2141351,53154135,342};
        System.out.println("Before Sort : ");
        printArray(arr);
        System.out.println("After Sort : ");
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
