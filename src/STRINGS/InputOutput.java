package STRINGS;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name;
        //name=in.next();
        name=in.nextLine();
        System.out.println(name);
        System.out.println(name.length());
    }
}
