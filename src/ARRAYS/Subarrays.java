package ARRAYS;

public class Subarrays {
    public static void subarrays(int numbers[]) {
        int ts=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){//we aren't starting from i+1 as we want single subarray as well
                int end=j;
                for(int k=start;k<=end;k++){//just for printing this loop is used
                    System.out.print(numbers[k]+" ");//subarray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total numbers of subarray: "+ts);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        subarrays(numbers);
    }
}
