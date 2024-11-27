package Array;

public class LinearSearch  {
    public static int Search(int numbers[] , int key){
        for(int i = 0 ; i<numbers.length ; i++){
            if(numbers[i] == key){
                return i;
            }

        }
        return -1;
    }
public static void main(String[] args) {
    int numbers[] = {2,3,4,5,6,7,8,9,10,12};
    int key = 6 ;

    int index = Search(numbers, key);
    if(index == -1){
        System.out.println("NOt found");
    }
    else{
        System.out.println("key index is " + index);
    }
}    
}
