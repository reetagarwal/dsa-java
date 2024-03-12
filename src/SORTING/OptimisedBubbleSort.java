package SORTING;

import java.util.Scanner;

public class OptimisedBubbleSort {
    public static void bubbleSort(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int swap=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                swap++;
            }
        }

    }
    //O(n^2)
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [10];
        arr[10]=sc.nextInt();
        bubbleSort(arr);
        printArr(arr);
    }
}
