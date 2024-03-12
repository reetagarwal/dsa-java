package FUNCTIONS;

import java.util.Scanner;

public class HelloWorld {
    public static void printHelloworld() {
        System.out.println("Hello world");
        /*
        if you wanna print hello world three times then just the print statement thrice her
        but in the main function it will be called only once
         */
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        printHelloworld();
        System.out.println("Enter your name");
        String name=in.next();
        String personalised =myGreet(name);
        System.out.println(personalised);
    }

     static String myGreet(String name) {
        String message="Hello"+name;
        return message;
    }
}
