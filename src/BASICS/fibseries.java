package BASICS;

import java.util.Scanner;

public class fibseries {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=0,b=1,c;
        System.out.print(a+",");
        System.out.print(b+",");
        for(int i=0;i<=6;i++){
            c=b+a;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}
