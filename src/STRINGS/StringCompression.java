package STRINGS;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(compression(str));
    }

    static String compression(String str) {
        String newStr="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return newStr;//compressed string


    }
}
