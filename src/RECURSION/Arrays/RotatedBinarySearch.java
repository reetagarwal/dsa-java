package RECURSION.Arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[]arr={5,6,7,8,9,1,2,3};
        System.out.println(rotatedBinary(arr,5,0, arr.length-1));
    }
    static int rotatedBinary(int[]arr,int target,int s,int e){
        if(s>e){
            return -1;
        }

        int m = s + (e-s) / 2;
        if(arr[m] == target){
            return m;
        }

        if(arr[s]<=arr[m]){
            if(target>=arr[s] && target<=arr[m]){
                return rotatedBinary(arr,target,s,m-1);
            }
            else{
                return rotatedBinary(arr, target, m+1, e);
            }
        }

        if(target>=arr[m] && target<=arr[e]){
            return rotatedBinary(arr, target, m+1, e);
        }
        return rotatedBinary(arr,target,s,m-1);
    }
}
