package Assignment2;

public class Q3SelectionSort {
  public static void selectionSort(int arr[]){
    int n = arr.length;
    for(int i=0; i<n-1; i++){
      int minIndex = i;
      for(int j=i+1; j< n; j++){
        if(arr[j] > arr[minIndex]){
          minIndex = j;
        }

        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
      }
    }
  }

  public static void printArray(int arr[]){
    for(int num : arr){
      System.out.print(num+" ");
    }
    System.out.println();
  }
  public static void main(String args[]){
    int arr[] ={5,2,7,3,5,8,3,5,9,2};

    System.out.println("Before Selection Sorting: ");
    printArray(arr);

    System.out.println();

    //System.out.println("After Bubble Sorting: ");
    selectionSort(arr);

    System.out.println("After Selection Sorting: ");
    printArray(arr);
    

  }
}
