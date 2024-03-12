package FUNCTIONS;

import java.util.Scanner;

public class Sum {
//    public static void CalculateSum(){
//        Scanner in=new Scanner(System.in);
//        int a=in.nextInt();
//        int b=in.nextInt();
//        int sum=a+b;
//        System.out.println("Sum is :"+sum);
//    }
//    public static void main(String[] args) {
//        CalculateSum();
//    }
//

    //now using parameters
//    public static int CalculateSum(int num1,int num2) {
//        int sum=num1+num2;
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        int a=in.nextInt();
//        int b=in.nextInt();
//        int sum=CalculateSum(a,b);
//        System.out.println("Sum is :"+sum);
//    }


    //using parameter method 2
    public static void CalculateSum(int num1, int num2) {//paramters or formal parameters
        int sum=num1+num2;
        System.out.println("Sum is:"+sum);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        CalculateSum(a,b);//arguements or actual parameters
    }

}
