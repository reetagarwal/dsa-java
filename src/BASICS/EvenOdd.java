package BASICS;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        if(n%2==0){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}
