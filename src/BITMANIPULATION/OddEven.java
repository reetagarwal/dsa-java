package BITMANIPULATION;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        evenodd(n);
    }
    static void evenodd(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            //even number
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
