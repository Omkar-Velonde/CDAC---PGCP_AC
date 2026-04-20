package Assignment4;

public class Q6SortingStrings {
    void sortStrings(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\"" + arr[i] + "\"");
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
    	Q6SortingStrings obj = new Q6SortingStrings();

        String[] arr1 = {"apple", "banana", "cherry", "date"};
        obj.sortStrings(arr1);
        obj.printArray(arr1);

        String[] arr2 = {"dog", "cat", "elephant", "bee"};
        obj.sortStrings(arr2);
        obj.printArray(arr2);
    }
}
