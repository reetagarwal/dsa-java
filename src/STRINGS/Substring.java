package STRINGS;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        String str;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        str= in.nextLine();
        System.out.println("Enter a starting index");
        int si= in.nextInt();
        System.out.println("Enter a ending index");
        int ei=in.nextInt();
        System.out.println(substring(str,si,ei));
    }

    static String substring(String str,int si,int ei) {
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
}
