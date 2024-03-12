package BITMANIPULATION;

import java.util.Scanner;

public class GetIthBit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=in.nextInt();
        System.out.println("Enter the value of i");
        int i=in.nextInt();
        System.out.println(getithbit(n,i));
    }

    static int getithbit(int n, int i) {
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
}
