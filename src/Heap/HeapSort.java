package Heap;

public class HeapSort {
    public static void heapSortAsc(int[] arr){
        //build max heap
        int n= arr.length;
        for(int i=n/2;i>=0;i--){
            heapifyAsc(arr,i,n);
        }
        //push largest at end
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapifyAsc(arr,0,i);
        }
    }

    public static void heapifyAsc(int[] arr,int i,int size){
        int left=(2*i)+1;
        int right=(2*i)+2;
        int max=i;

        if(left<size && arr[left]>arr[max]){
            max=left;
        }
        if(right<size && arr[right]>arr[max]){
            max=right;
        }

        if(max!=i){
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;

            heapifyAsc(arr,max,size);
        }
    }

    public void heapSortDesc(int[] arr){
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapifyDesc(arr,i,n);
        }
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapifyDesc(arr,0,i);
        }
    }

    public void heapifyDesc(int[] arr,int i,int size){
        int left=(2*i)+1;
        int right=(2*i)+2;
        int min=i;

        if(left<size && arr[left]<arr[min]){
            min=left;
        }
        if(right<size && arr[right]<arr[min]){
            min=right;
        }

        if(min!=i){
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

            heapifyDesc(arr, min, size);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5,3,9};
        heapSortAsc(arr);

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }
}
