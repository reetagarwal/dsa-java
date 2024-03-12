package BITMANIPULATION;

import java.util.Scanner;

public class SetIthBit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=in.nextInt();
        System.out.println("Enter the value of i");
        int i=in.nextInt();
        System.out.println("Answer is"+setithbit(n,i));
    }

     static int setithbit(int n, int i) {
        int bitmask=1<<i;
        return n|bitmask;
    }
}
