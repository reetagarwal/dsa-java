package FUNCTIONS;

import java.util.Scanner;

public class Prime {
//    public static boolean isPrime(int n) {
//        boolean isPrime=true;
//        for(int i=2;i<=n-1;i++){
//            if(n%i==0) {//completely dividing
//                isPrime = false;
//                break;
//            }
//        }
//        return isPrime;
//    }
//    public static void main(String[] args) {
//        System.out.println(isPrime(5));
//    }


    //only for n>=2
//     static boolean isPrime(int n) {
//        //corner cases
//        //2
//         // 1
//         if(n==1){
//             return false;
//         }
//        if(n==2){
//            return true;
//        }
//        for(int i=2;i<=n-1;i++){
//            if(n%i==0) {//completely dividing
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        System.out.print(isPrime(5));
//    }

    static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0) {
                return false;//not prime
            }
            c++;
        }
        return c*c>n;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean ans=isPrime(n);
        System.out.println(ans);
    }
}
