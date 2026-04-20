package Assignment4;

public class Q5QuickSort {
    void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
    	Q5QuickSort obj = new Q5QuickSort();

        int[] arr1 = {10, 7, 8, 9, 1, 5};
        obj.quickSort(arr1, 0, arr1.length - 1);
        obj.printArray(arr1);

        int[] arr2 = {1, 1, 1, 1};
        obj.quickSort(arr2, 0, arr2.length - 1);
        obj.printArray(arr2);
    }
}
