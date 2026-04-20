package Assignment1;

public class Q4CheckArraySorted {
    boolean isSorted(int[] arr, int index) {
        if (index >= arr.length - 1) return true;

        if (arr[index] > arr[index + 1]) return false;

        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        Q4CheckArraySorted obj = new Q4CheckArraySorted();

        int[] arr1 = {2, 4, 6, 8};
        System.out.println(obj.isSorted(arr1, 0));

        int[] arr2 = {3, 5, 2, 9};
        System.out.println(obj.isSorted(arr2, 0));
    }
}
