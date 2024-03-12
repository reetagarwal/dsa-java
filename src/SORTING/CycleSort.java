package SORTING;

import java.util.Arrays;
import java.util.Scanner;

public class CycleSort {
    public static void main(String[] args) {
        int arr[]={3,5,2,1,4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr) {
        int i=0;
        while(i < arr.length){
            int correctIndex=arr[i]-1;//index=value-1
            if(arr[i]!=arr[correctIndex]){
                //swap
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }
            else{
                i++;
            }
        }
    }
}

//this only works for continuous numbers
