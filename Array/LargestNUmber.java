package Array;
import java.util.*;


public class LargestNUmber {
    public static int Largest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        // -2^31 =-
        // MAX_vALUE = -2^31-1 32 bit signed integer 

        for(int i =0 ; i<numbers.length ; i++){
            if (largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;



    }
    public static void main(String[] args) {
        int numbers[] ={1,2,3,4,5,6,7,122};
        System.out.println(Largest(numbers));

    }
}
