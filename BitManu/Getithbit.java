package BitManu;

public class Getithbit {
    public static int getBit(int n , int i){
        int bitMask =1<<i;
        if((n & bitMask)==0){
            return 0;


        }
        else{
            return 1;
        }
    }

    public static int setBit(int n , int i){
        int bitMask =1<<i;
        return n | bitMask;
    }
    public static int clearBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateBit(int n , int i , int newBit){
        // if(newBit ==0){
        //     return clearBit(n, i);
        // }
        // else{
        //     return setBit(n, i);
        // }
        n = clearBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;

        
    }

    public static int clearIBits(int n , int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    // clear bits in specific range 
    public static int clearBitsinrange(int n , int i , int j){
        int a = (~0)<<(j+1);
        int b = (1<<i) -1;
        int bitMask =a|b;
        return n & bitMask;
    }

    // find if it is power of 2
    public static boolean isPowerOfTwo(int n){
        
        
        
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(getBit(10, 3));
        System.out.println(setBit(10, 2));
        System.out.println(clearBit(10, 1));
        System.out.println(updateBit(10,2 , 1));
        System.out.println(clearIBits(15, 2));
        System.out.println(clearBitsinrange(10, 2, 4));
        System.out.println(isPowerOfTwo(8));
    }
}
