package SORTING;
/*non-comparison sorting algo
  small numbers only
  stable algo
  time complexity:O(N+M)
  M is the extra array so if M isn't created then space complexity:O(N)
 */
/*Steps for this sort
s1-largest number find(eg:largest is 8)
s2-create an array of largest+1(arr=9 length)
   frequency array is created where index number=element number in original number
 */

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int arr[]={3,4,1,3,2,5,2,8};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void countSort(int[] arr) {
        int max=arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        int[] countArr=new int[max+1];
        for(int num:arr){
            countArr[num]++;
        }
        int index=0;
        for(int i=0;i<=max;i++){
            while(countArr[i]>0){

            }
        }
    }

}
