package RECURSION;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    static int fact(int n) {
        if(n==1){//base case
            return 1;
        }
        return n*fact(n-1);
    }
}

//fact(n)=n*fact(n-1)
