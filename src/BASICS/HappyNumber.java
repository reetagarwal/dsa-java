package BASICS;

public class HappyNumber {
    public static void main(String[] args) {
        int n=2;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n){
        int slow=n;
        int fast=n;
        do {
            slow=sum(slow);
            fast=sum(sum(fast));
            if(slow==1){
                return true;
            }
        }while(slow!=fast);
        return false;
    }

    public static int sum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem*rem;
            n=n/10;
        }
        return sum;
    }
}
