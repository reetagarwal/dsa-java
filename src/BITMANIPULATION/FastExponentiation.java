package BITMANIPULATION;

import java.util.Scanner;

public class FastExponentiation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Enter the power");
        int pow=sc.nextInt();
        System.out.println(exponentiation(n,pow));
    }

    static int exponentiation(int n,int pow) {
        int ans=1;
        //converting into binary number system
        while(pow>0){
            if((pow&1)!=0){//checking LSB(if LSB is a non-zero value that means it is a set bit
                ans=ans*n;
            }
            n=n*n;
            pow=pow>>1;
        }
        return ans;
    }
}
