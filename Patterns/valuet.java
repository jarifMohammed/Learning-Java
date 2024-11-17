package Patterns;
public class valuet {

    
public static void main(String[] args) {
    int n =5;
    for(int row = 1 ; row<=n ; row++){
        int val =row;
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