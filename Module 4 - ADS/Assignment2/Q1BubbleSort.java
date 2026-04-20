package Assignment2;

public class Q1BubbleSort {

  public static void bubbleSort(int arr[]){
    int n = arr.length;
    for(int i =0; i<n-1; i++){
      for(int j=0; j<n-1-i; j++){
    
        if(arr[j] > arr[j+1]){
          System.out.print(j);
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
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

    System.out.println("Before Bubble Sorting: ");
    printArray(arr);

    System.out.println();

    //System.out.println("After Bubble Sorting: ");
    bubbleSort(arr);

    System.out.println("After Bubble Sorting: ");
    printArray(arr);

  }
}
