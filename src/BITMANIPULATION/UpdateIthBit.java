package BITMANIPULATION;

import java.util.Scanner;

public class UpdateIthBit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=in.nextInt();
        System.out.println("Enter the value of i");
        int i=in.nextInt();
        System.out.println("Enter a newBit");
        int newBit=in.nextInt();
        System.out.println(updateithbit(n,i,newBit));
    }

    static int clearithbit(int n, int i) {
        int bitmask=~(1<<i);
        return n&bitmask;

    }

    static int setithbit(int n, int i) {
        int bitmask=1<<i;
        return n|bitmask;
    }

    static int updateithbit(int n, int i,int newBit) {
        if(newBit==0){
            return clearithbit(n,i);
        }
        else{
            return setithbit(n,i);
        }
    }
}


/*Second method
n=clearithbit(n,i)
int bitmask=newbit<<i
return n|bitmask
 */