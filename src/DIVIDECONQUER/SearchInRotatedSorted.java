package DIVIDECONQUER;

public class SearchInRotatedSorted {
    public static void main(String[] args) {
        int[]arr={4,5,6,7,0,1,2};
        int target=0;//output->4
        System.out.println(search(arr,target,0,arr.length-1));
    }

    public static int search(int[]arr,int tar,int si,int ei) {

        //Base Case
        if(si>ei){
            return -1;
        }

        int mid=si+(ei-si)/2;

        //Best Case:Case found
        if(arr[mid]==tar){
            return mid;
        }

        //Case 1:mid on Line1
        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar && tar<=arr[mid]){
               return search(arr,tar,si,mid);//case a:Line1->left
            }
            else{
                return search(arr,tar,mid+1,ei);//case b:Mid->right
            }
        }

        //Case 2:mid on Line2
        else{
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr,tar,mid+1,ei);//case c:right
            }
            else{
                return search(arr,tar,si,mid-1);//case d:left
            }
        }

    }
}
