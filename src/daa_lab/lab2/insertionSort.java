package daa_lab.lab2;

/*
partially sorting the array-part by part solve the array
for every index you ar at put that index element at the correct index of LHS
time complexity- O(n^2)
 */

import java.util.Arrays;
import java.util.Scanner;


public class insertionSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Create your array");
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("The created array is:"+" "+ Arrays.toString(arr));
        System.out.println("The sorted array is:");
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }


            }
        }
    }


}


/*Why to use?
number of swaps are less that bubble sort
more stable
used for smaller values of n - works good for which array is partially sorted
it takes part in hybrid sorting algo
 */
