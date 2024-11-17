package Patterns;

public class floydsTriangle {
    public static void main(String[] args) {
        int n =5;
        int val =1;
        for(int row = 1 ; row<=n ; row++){
            
            for(int col=1 ; col<=n ;col++){
                if(row - col>=0){
                    System.out.print(val);
                    val++;
                }
                
            }
            System.out.println();
        }
    }
    
}
