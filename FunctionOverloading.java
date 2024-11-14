// Function overloading means multiple functions with the same but different parameters.

// function overloading depends on parameters not return type
public class FunctionOverloading {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a , int b, int c){
        return a+b+c;
    }
    
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3,5,7));
    }
}


// Using data types 

// public class FunctionOverloading {
    public static int sum(int a, int b){
                return a+b;
            }
           public static float sum(float a , float b, float c){
               return a+b+c;
            }
            public static void main(String[] args) {
                System.out.println(sum(4,5));
                System.out.println(sum(3.4f,5f,1f));
            }
    
}