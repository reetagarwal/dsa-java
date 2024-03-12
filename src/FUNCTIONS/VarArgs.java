package FUNCTIONS;

import java.util.Arrays;

public class VarArgs {
    private static int a;

    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8,9,1,4,14);
        multiple(2,3,"reet","preet","lucy");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a,int b,String ...v){
        System.out.println();
    }

    //if you do not know how many integers you want take you can simply write three dots(...)and a variable
    //in this case ...v is taken
    //variable length argument always comes at the end(as taken in second method)
}
