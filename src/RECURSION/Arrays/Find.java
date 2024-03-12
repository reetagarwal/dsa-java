package RECURSION.Arrays;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[]arr={2,4,5,8,9,1};
        System.out.println(search(arr,4,0));
        System.out.println(searchIndex(arr,9,0));
        System.out.println(searchIndexFromLast(arr,0,arr.length-1));
        searchAllIndex(arr,4,0);
        System.out.println(list);
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


    static ArrayList<Integer>list=new ArrayList<>();
    static void searchAllIndex(int[]arr,int target,int index){

        //base condition
        if(index== arr.length){
            return;
        }

        if(arr[index]==target){
            list.add(index);
        }

        searchAllIndex(arr,target,index+1);

    }
}




/*
things that you add inside the parameter means it will be passed onto function calls
things that you add inside the function body , it will be available only for that function call
 */