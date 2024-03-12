package BASICS;

import java.util.Scanner;

public class YourDetails {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= in.next();
        System.out.println("Enter your roll number:");
        int roll=in.nextInt();
        System.out.println("Enter your university name:");
        String univ= in.next();
        System.out.println("Enter your branch:");
        String branch=in.next();
        System.out.println("Enter your section:");
        String sec=in.next();
        System.out.println("Your name is " +name+ "Roll number is " +roll+ "University name is " +univ+ "Branch is " +
                branch + "Section is "+sec);
    }
}
