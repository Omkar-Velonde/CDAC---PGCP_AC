package Assignment2;

public class Q2InsertionSort {

  public static void insertionSort(int arr[]){
    int n = arr.length;
    for(int i =0; i<n; i++){
			int key = arr[i];
			int j = i-1;
		  
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j--;

			}
			arr[j+1] = key;
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

    System.out.println("Before Insertion Sorting: ");
    printArray(arr);

    System.out.println();

    //System.out.println("After Bubble Sorting: ");
    insertionSort(arr);

    System.out.println("After Insertion Sorting: ");
    printArray(arr);

  }

}
