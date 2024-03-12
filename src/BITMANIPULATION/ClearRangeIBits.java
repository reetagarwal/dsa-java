package BITMANIPULATION;

import java.util.Scanner;

public class ClearRangeIBits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=in.nextInt();
        System.out.println("Enter the value of i");
        int i=in.nextInt();
        System.out.println("Enter the range");
        int j=in.nextInt();
        System.out.println("Answer is "+clearrangeibit(n,i,j));
    }

    static int clearrangeibit(int n, int i,int j) {
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }
}
