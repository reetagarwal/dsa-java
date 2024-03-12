package RECURSION.Arrays;

//finding if an element exists or not

public class LinearSearch {
    public static void main(String[] args) {
        int[]arr={2,4,5,8,9,1};
        System.out.println(search(arr,4,0));
        System.out.println(searchIndex(arr,9,0));
        System.out.println(searchIndexFromLast(arr,0,arr.length-1));
    }

    static boolean search(int[]arr,int target,int index){

        //base condition
        if(index== arr.length){
            return false;
        }

        return arr[index]==target || search(arr,target,index+1);
    }

    static int  searchIndex(int[]arr,int target,int index){

        //base condition
        if(index== arr.length){
            return -1;
        }

        if(arr[index]==target){
            return index;
        }

        return searchIndex(arr,target,index+1);

    }

    static int  searchIndexFromLast(int[]arr,int target,int index){

        //base condition
        if(index== -1){
            return -1;
        }

        if(arr[index]==target){
            return index;
        }

        return searchIndexFromLast(arr,target,index-1);

    }
}
