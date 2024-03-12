package BITMANIPULATION;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println(count(n));
    }

    private static int count(int n) {
        int count=0;
        while(n>0){//comparing LSB
            if((n&1)!=0){//checking LSB
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}
