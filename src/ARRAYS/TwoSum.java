package ARRAYS;

public class TwoSum {
    public static void main(String[] args) {
        int target=9;
        int[] num={2,7,11,15};
        System.out.println(twoSum(num,target));
    }

    public static int[] twoSum(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
