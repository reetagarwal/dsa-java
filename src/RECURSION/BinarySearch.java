package RECURSION;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,55,66,78};
        int target=4;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
           return search(arr,target,s,m-1);
        }
        return search(arr,target,m+1,e);
    }
}




//make sure to return the result of a function call of the return type
//whatever in arguments will go into next function call
/*
Recurrence relation:
F(N)=O(1)+F(N/2)
O(1):Comparison
F(N/2):Dividing it in half
 */
//if two or more recursion calls are doing the same thing do not call it again or not f