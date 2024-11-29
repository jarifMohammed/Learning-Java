package Sorting;

public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        // Flag to track if the array is already sorted
        boolean isSortedEarly = false;

        // Outer loop for sorting
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swap = 0; // Flag to track if a swap happened during this pass

            // Inner loop for comparisons and swaps
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements if they're in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }

            // If no swaps occurred, the array is already sorted
            if (swap == 0) {
                isSortedEarly = true;  // Mark that the array is already sorted
                break; // Exit the loop early as the array is sorted
            }
        }

        // Print "Already Sorted" only if the loop broke early
        if (isSortedEarly) {
            System.out.println("Already Sorted");
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
        bubbleSort(arr);  // Call bubbleSort to check if the array is sorted
        print(arr);  // Print the array (even if it's already sorted)
    }
}
