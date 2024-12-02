package Matrix;

public class DiagonalSum {

    public static int diagonalSum(int matrix[] []){
        int sum = 0 ;
        //  for(int i = 0 ; i<matrix.length ; i++){
        //     for(int j =0 ; j<matrix[0].length; j++){
        //         if(i == j){
        //             sum = sum+matrix[i] [j];

        //         }
        //         if(i+j ==matrix.length-1){
        //             sum =sum+matrix[i][j];
        //         }
            

        //     }
        //  }
        for(int i=0 ;i<matrix.length ;i++ ){
            //pd
            sum = sum+matrix[i] [i];
            //sd
            if(i != matrix.length-1-i){
                sum =sum+ matrix[i] [matrix.length-1-i];
            }
            
            
        }


         return sum;
    }


    public static boolean staircaseSearch(int matrix[][] , int key){
        int row =0 , col = matrix[0].length-1;

        while(row<matrix.length && col>= 0){
            if(matrix[row] [col] == key){
                System.out.println("found key at (" +row+ ","+col+")");
                System.out.println( matrix[row][col]);

                return true;
            }
            else if(key <matrix[row] [col]){
                col--;
            }
            else{
                row++;
            }

        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[] [] ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}

           
        };
        System.out.println( staircaseSearch(matrix, 7));
        
    }
}
