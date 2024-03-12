package FUNCTIONS;

public class Product {
    public static int Multiply(int a , int b) {
        int pro=a*b;
        return pro;
    }
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int pro=Multiply(a,b);
        System.out.println("The product of two numbers is:"+pro);
        //you can again use the function call to multiply another two numbers
    }
}
