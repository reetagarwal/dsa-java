package FUNCTIONS;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class FunctionOverloading {
    //function overloading using number of parameterb
    public static int Sum(int a,int b){
        return a+b;
    }
    public static int Sum(int a,int b,int c){
        return a+b+c;
    }
    //function overloading using data types
    public static float Sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(Sum(3,5));
        System.out.println(Sum(5,7,8));
        System.out.println(Sum(3.2f,5.3f));
    }
}
