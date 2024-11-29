package Sorting;

public class SelectionSort {

    public static void selectionSort(int arr[]) {
    

        // Outer loop for sorting
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i ;
            // Inner loop for comparisons and swaps
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minPos] >arr [j]){
                    minPos=j;
                }
                }
                 
                    // Swap elements if they're in the wrong order
                    int temp = arr[minPos];
                    arr[minPos] = arr[i];
                    arr[i] = temp;
                    
            

            
            }
        }

        
        

        // Print the array
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // Print each element with a space
        }
        System.out.println();  // Newline after printing all elements
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 5, 4};  // Example sorted array
        selectionSort(arr);  // Call bubbleSort to check if the array is sorted
        print(arr);  // Print the array (even if it's already sorted)
    }
}
