package Assignment4;

public class Q3SelectionSort {
    void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
    	Q3SelectionSort obj = new Q3SelectionSort();

        int[] arr1 = {64, 25, 12, 22, 11};
        obj.selectionSort(arr1);
        obj.printArray(arr1);

        int[] arr2 = {29, 10, 14, 37, 13};
        obj.selectionSort(arr2);
        obj.printArray(arr2);
    }
}
