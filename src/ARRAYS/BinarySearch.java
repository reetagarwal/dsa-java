package ARRAYS;

public class BinarySearch {
    public static int binarySearch(int[] numbers,int key) {
        int start=0,end=numbers.length-1;
        while(start<=end){//equals to is that case where start=end that means the smallest size of an array
            int mid=(start+end)/2;
            //comparisons
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;//if they key isn't there in the array
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println("index of key is:"+binarySearch(numbers,key));
    }
}
