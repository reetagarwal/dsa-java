package DIVIDECONQUER;

public class QuickSort {
    public static void main(String[] args) {
        int[]arr={6,3,9,8,2,5};
        sort(arr,0,arr.length-1);
        printArr(arr);
    }
    public static void printArr(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void sort(int[]arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int pIndex=partition(arr,si,ei);
        sort(arr,si,pIndex-1);//left part
        sort(arr,pIndex+1,ei);
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot=arr[ei];
        int i=si-1;//making space for smaller elements than pivot

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }

        //to put pivot in it's actual place
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }
}
