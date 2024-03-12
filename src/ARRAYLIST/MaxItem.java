package ARRAYLIST;

public class MaxItem {
    public static void main(String[] args) {
        int[]arr={1,2,23,9,18};
        System.out.println(max(arr));
    }
    static int max(int[]arr){
        if(arr.length==0){
            return -1;
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
