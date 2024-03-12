package RECURSION;

public class Nto1 {
    public static void main(String[] args) {
       fun(5);
       funRev(5);
       funBoth(5);
    }

    static void fun(int n){//1 to n
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }

    static void funRev(int n){//n to 1
        if(n==0){
            return;
        }
        System.out.println(n);
        funRev(n-1);
    }

    static void funBoth(int n){//n to 1 and 1 to n
        if(n==0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}

