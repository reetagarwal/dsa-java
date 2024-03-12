//find whether the alphabet is upper or lower case

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch=input.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Character is in lower case "+ch);
        }
        else{
            System.out.println("character is in upper case"+ch);
        }
    }
}
