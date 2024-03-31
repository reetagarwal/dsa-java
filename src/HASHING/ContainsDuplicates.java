package HASHING;

import java.util.HashMap;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        int k=3;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer , Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(Math.abs(i-map.get(nums[i]))<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
