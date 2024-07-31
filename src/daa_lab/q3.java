package daa_lab;

import java.util.ArrayList;
import java.util.List;

public class q3 {
    public static void rightrotate(int arr[],int k,int n){
        List<Integer> ans=new ArrayList<>();
        ans.add(arr[k-1]);
        for(int i=0;i<n;i++){
            if(i!=(k-1)){
                ans.add(arr[i]);
            }
        }
        int a=0;
        for(int i:ans){
            arr[a++]=i;
        }
    }
}
