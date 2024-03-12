/*
basically for eg you have a number 12345456785
then you gotta find out how many times 5 is occuring in this number
 */

import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=0;
        int n=in.nextInt();
        while(n>0){
            int rem=n%10;
            if(rem==5){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
