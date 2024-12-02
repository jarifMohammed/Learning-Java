package BitManu;

public class OddEven {
    public static void OddEven(int n){
        int bitMask = 1;

        if( (n & bitMask) == 0){
            //even
            System.out.println("even ");

        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        OddEven(5);
        OddEven(3);
        OddEven(15);
        OddEven(20);
    }
}
