package Assignment4;

public class Q2InsertionSort {
    void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
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
    	Q2InsertionSort obj = new Q2InsertionSort();

        int[] arr1 = {12, 11, 13, 5, 6};
        obj.insertionSort(arr1);
        obj.printArray(arr1);

        int[] arr2 = {4, 3, 2, 10, 12};
        obj.insertionSort(arr2);
        obj.printArray(arr2);
    }
}
