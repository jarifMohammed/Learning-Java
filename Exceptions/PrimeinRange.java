import java.util.*;



public class PrimeinRange {
    

 public static boolean isPrime(int n) {
    for(int i=2; i<=Math.sqrt(n);i++){
        if(n % i == 0){
            return false;
        }
    }
    return true;
    
 }

    public static void primeInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        System.out.println();

    }
    
    public static void main(String[] args) {
        primeInRange(20);
    }
}


// Scope

// Method Scope
// Block scope
// {} to {} variable can be used only in this range 