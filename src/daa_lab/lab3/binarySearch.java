package daa_lab.lab3;

public class binarySearch {

    public int binarySearch(int[] arr,int s,int e,int tar){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==tar){
            return mid;
        } else if (arr[mid]>tar) {
            return binarySearch(arr,s,mid-1,tar);
        }
        else
            return binarySearch(arr, mid+1, e, tar);
    }

    public int ternarySearch(int[] arr,int s,int e,int tar){
        if(s>e){
            return -1;
        }

        int mid=s+(e-s)/3;
        int mid2=e-(e-s)/3;

        if(arr[mid]==tar){
            return mid;
        }

        if(arr[mid2]==tar) {
            return mid2;
        }

        if (arr[mid]>tar) {
            return ternarySearch(arr,s,mid-1,tar);
        }

        if(arr[mid]<tar && arr[mid2]>tar){
            return ternarySearch(arr,mid+1,mid2-1,tar);
        }

        else
            return ternarySearch(arr, mid2+1, e, tar);
    }
    public static void main(String[] args) {

    }
}
