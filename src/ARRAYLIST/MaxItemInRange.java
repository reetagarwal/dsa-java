package ARRAYLIST;

public class MaxItemInRange {
    public static void main(String[] args) {
        int[]arr={1,2,23,9,18};
        System.out.println(maxRange(arr,1,4));
    }

    static int maxRange(int[] arr,int start,int end) {
        if(end>start){
            return -1;
        }
        if(arr.length==0){
            return -1;
        }
        int max=arr[0];
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
