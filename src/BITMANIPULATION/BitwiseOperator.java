package BITMANIPULATION;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(a<<b);
        System.out.println(a>>b);
    }

}
