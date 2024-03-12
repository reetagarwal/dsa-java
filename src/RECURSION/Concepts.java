package RECURSION;


public class Concepts {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
//        fun(n--);
        fun(--n);
    }
}

/*
1. n-- will pass 5 first and then subtract therefore it is only passing 5 all the time
so it will run infinite times
2. --n it will subtract first and then pass
 */
