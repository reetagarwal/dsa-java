package daa_lab.lab3;

public class mergeSort {

    public static void main(String[] args) {
        int[] arr={6,3,9,5,2,8};
        sort(arr,0, arr.length-1);
        printArr(arr);
    }
    public static void printArr(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void sort(int[] arr,int s,int e){
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        sort(arr,s,mid);
        sort(arr,mid+1,e);
        merge(arr,s,mid,e);
    }

    private static void merge(int[] arr, int s, int mid, int e) {
        int[] temp=new int[e-s+1];

        int i=s;//iterator for left part
        int j=mid+1;//iterator for right part
        int k=0;//iterator for temp array

        while(i<=mid && j<=e){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=e){
            temp[k++]=arr[j++];
        }

        for(k=0,i=s;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
}
