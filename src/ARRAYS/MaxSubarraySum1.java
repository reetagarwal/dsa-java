package ARRAYS;

public class MaxSubarraySum1 {
    public static void maxSubArray(int numbers[]) {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;//-infinity
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currentSum=0;
                for(int k=start;k<=end;k++){
                    currentSum+=numbers[k];
                }
                System.out.println(currentSum);
                if(maxSum<currentSum){
                    maxSum=currentSum;
                }
            }
            System.out.println();//for showing a gap between every numbers sum
        }
        System.out.println("Maximum Sum is :"+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        maxSubArray(numbers);
    }
}
