package DP;
//optimising space complexity
public class fibonacci3 {
    public static void main(String[] args) {
        int n=5;
        int prev2=0;
        int prev=1;
        for(int i=2;i<=n;i++){
            int curr=prev2+prev;
            prev2=prev;
            prev=curr;
        }
        System.out.println(prev);
    }
}
