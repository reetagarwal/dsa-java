package STRINGS;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String str;
        Scanner in=new Scanner(System.in);
        str= in.nextLine();
        System.out.println(palindrome(str));
    }

   static boolean palindrome(String str) {
       for (int i = 0; i < str.length() / 2; i++) {
           if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
              // System.out.println("Not a palindrome");
               return false;
           }
       }
       //System.out.println("Is a palindrome");
       return true;
   }
}
