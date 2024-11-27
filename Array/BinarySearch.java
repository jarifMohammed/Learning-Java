package Array;

public class BinarySearch {
    public static int Search(int numbers[] , int key){
      int  start = 0 , end = numbers.length-1 ;

      while(start<=end){
        int mid = (start + end) / 2 ;

        // comparisons
        if(numbers[mid] ==key){
            return mid ;
        }
        // right
        if(numbers[mid]<key){
            start = mid+1;
        }
        // left
        else{
            end = mid-1 ;
        }
      }
      return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,10,24,25};
       int key = 10;
       System.out.println("index is " + Search(numbers, key));

    }
}
