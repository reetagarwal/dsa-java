package daa_lab;

public class q2 {
    public static int[] prefix(int arr[]){
        int n=arr.length;
        int ans[]=new int[n];
        ans[0]=arr[0];
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+arr[i];
        }
        return ans;
    }
}
