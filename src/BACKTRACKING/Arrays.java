package BACKTRACKING;

public class Arrays {
    public static void main(String[] args) {
        int[] arr=new int[5];
        changeArr(arr,0,1);
        printArr(arr);
    }
    public static void changeArr(int[]arr,int i,int val){//i for traversing and val for assignment of that value
        if(i==arr.length){//base case
            printArr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        changeArr(arr,i+1,val+1);
        arr[i]=arr[i]-2;
    }
    public static void printArr(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
