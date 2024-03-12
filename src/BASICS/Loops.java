import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //printing numbers from 1-5
//        for(int i=1;i<=5;i++){
//            System.out.println(i);
//        }

        //print numbers from 1 to n
        //for loop
//        int n=input.nextInt();
//        for(int num=1;num<=n;num++){
//            System.out.println(num);
//        }


        //while loop
//        int num=1;
//        while(num<=5){
//            System.out.println(num);
//            num+=1;
//        }


        //do while loop
        /*syntax
        do{
        }while(condition
         */
        int n=1;
        do{
            System.out.println(n);
            n++;
        }while(n<=5);
        //do while loop executes atleast once unlike other loops
    }
}
