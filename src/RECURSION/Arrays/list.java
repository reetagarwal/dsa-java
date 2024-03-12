package RECURSION.Arrays;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
       int[]arr={2,3,1,4,4,5};
        ArrayList<Integer> ans=searchAllIndex(arr,4,0,new ArrayList<>());
        System.out.println(ans);
    }

    static ArrayList<Integer> searchAllIndex(int[]arr,int target,int index,ArrayList<Integer>list){

        //base condition
        if(index== arr.length){
            return list;
        }

        if(arr[index]==target){
            list.add(index);
        }

       return searchAllIndex(arr,target,index+1,list);

    }
}
