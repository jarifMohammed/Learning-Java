import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
       System.out.println("enter a number");
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();

       if(isPalindrom(number)){
        System.out.println(number +" is palindrom");
       }
       else{
System.out.println(number + "is not palindrom");
       }

    }

    public static boolean isPalindrom(int number){
        int num = number ;
        int reverse = 0;

        while(num > 0 ){
            int lastdigit = num%10;

            reverse = reverse *10 +lastdigit;
            num = num /10;  
        }
        if(number == reverse){
            return true;
        }
        
        else{
            return false;
        }
       
    }
}
