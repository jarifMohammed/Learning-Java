 public class Functions {
    
    
    public static void swap(int a, int b){

        // swap
        int temp=a;
        a=b;
        b=temp;

        System.out.println("a=" +a);
        System.out.println("b=" +b);
    }
    
    public static void main(String[] args) {
       int  a=5;
       int b=10;
        swap(a,b);
        System.out.println("a=" +a); if i put this line here it will not print the swap because         
        System.out.println("b=" +b);//in java arguments passed for function are keep itself in function after completing the function this is called call by value 
//in java we do not pass orginal value of argument in function we pass a copy of it.
//passing orginial value is called cll by reference 
   }
} 
//the value written in the function are called parameters  to define function.
//the value added in the calling statement are called arguments  during function call

//What happens in memory when we call a functon?

//they are organised as call stack


public class Functions {

 public static  int multiply(int a , int b ){
    int product =a*b;
    return product;
 }

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
       int prod= multiply(a, b);
       System.out.println(prod);
    }
}


