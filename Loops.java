import java.util.*;
public class Loops {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int range = sc.nextInt();
     int counter = 1;


     while(counter<= range){
        System.out.println(counter);
        // if i do not put increment here it will run infinity time 
        counter++;
     }

    }
}


public class Loops {
 public static void main(String[] args) {
    for(int line=1; line<=4 ;line++){
        System.out.println("****");
        
    }
 }
    
}

// reversing number 
/* if you want to find the last digit of any number you have to do n%10 for all */
/* if you want to remove a last digit of a  number just divide by 10 */

// public class Loops {

    public static void main(String[] args) {
        int n =10899;

        while (n>0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n/10;
        }
        // System.out.println();
    }
}


//  find prime numbers

public class Loops {
    public static void main(String[] args) {
        int n = 29;  // You can change this value to test other numbers

        // Check if n is less than 2, because numbers less than 2 are not prime
        if (n <= 1) {
            System.out.println("The number is not prime");
            return;
        }

        // Loop from 2 to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("The number is not prime");
                return;  // If divisible, n is not prime, so return early
            }
        }

        // If no divisors were found, n is prime
        System.out.println("The number is prime");
    }
}
