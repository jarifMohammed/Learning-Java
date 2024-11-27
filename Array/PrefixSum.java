package Array;

public class PrefixSum {
    public static void print(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // calculate prefix
        for(int i =1 ; i<prefix.length;i++){
            prefix[i] = prefix[i-1] +numbers[i];
        }


        for(int i = 0 ; i<numbers.length ; i++){
            int start = i;
            for(int j=i ; j<numbers.length ; j++){
                int end = j ;
                currSum = start== 0 ? prefix[end] : prefix[end] -prefix[start-1] ;
                
                System.out.println(currSum);
                if(maxSum< currSum){
                    maxSum =currSum;
                }

            }
        }
        System.out.println("max sum" + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        print(numbers);
    }
}
//Start with the first element:

// prefix[0] = numbers[0] = 2

// For the second element:

//     prefix[1] = prefix[0] + numbers[1] = 2 + 4 = 6

// For the third element:

//     prefix[2] = prefix[1] + numbers[2] = 6 + 6 = 12

// For the fourth element:

//     prefix[3] = prefix[2] + numbers[3] = 12 + 8 = 20

// For the fifth element:

//     prefix[4] = prefix[3] + numbers[4] = 20 + 10 = 30