package FUNCTIONS;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number");
        int armstrong=in.nextInt();
        System.out.println(armstrong(armstrong));
    }

    static boolean armstrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            int cube=(int)Math.pow(rem,3);
            sum+=cube;
            n/=10;
        }
        if(sum==original){
            return true;
        }
        return false;
    }
}
