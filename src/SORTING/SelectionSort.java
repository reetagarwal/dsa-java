package SORTING;

import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Creation of an array");
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("The array you created is:"+" "+Arrays.toString(arr));
        System.out.println("the sorted array is:");
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
