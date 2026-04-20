package Assignment4;

public class Q1BubbleSort {
    void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
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
    	Q1BubbleSort obj = new Q1BubbleSort();

        int[] arr1 = {5, 2, 9, 1, 5, 6};
        obj.bubbleSort(arr1);
        obj.printArray(arr1);

        int[] arr2 = {3, 2, 1};
        obj.bubbleSort(arr2);
        obj.printArray(arr2);

        int[] arr3 = {1, 2, 3};
        obj.bubbleSort(arr3);
        obj.printArray(arr3);
    }
}
