/*fibonacci series printing
series:0,1,1,2,3,5,8,13
basically adding the previous two  numbers
*/
//basically the q is find the nth fibonacci number

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=0;//a=previous index
        int b=1;//b=current index
        int n=in.nextInt();
        int count=2;
        while(count<=n){
            int temp=b;
            b+=a;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
