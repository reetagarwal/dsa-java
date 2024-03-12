package BITMANIPULATION;

import java.util.Scanner;


public class CheckPowof2ornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println(power(n));
    }

    static boolean power(int n) {
        return (n&(n-1))==0;
    }
}
