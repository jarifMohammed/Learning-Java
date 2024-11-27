package Array;

public class KadaneAlgo {
    public static void kadans(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0 ; i<numbers.length ; i++){
            currSum =currSum +numbers[i];

            if(currSum< 0 ){
                currSum = 0;// because it is better to put Zero rather that Negative number as per kadanes algo
            }
            maxSum = Math.max(maxSum , currSum);
        }
        System.out.println("our max is " + maxSum);





    }    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-2};
        kadans(numbers);
    }
}


//  we used this algo to reduce time complexity like here we only usign one loop ratehr than 2 3 loops