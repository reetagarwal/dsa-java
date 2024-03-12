package ARRAYS;

public class MaxSubarraySum3 {
    public static void maxSubArray(int numbers[]) {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i< numbers.length;i++){
            currentSum+=numbers[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxSum=Math.max(currentSum,maxSum);//this will give max no among current and max sum
        }
        System.out.println("Maximum subarray sum is:"+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        maxSubArray(numbers);
    }
}
