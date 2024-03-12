import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //type conversion
//        float num=input.nextFloat();
//        System.out.println(num);


        //type casting
//        int num2=(int)(67.66f);
//        System.out.println(num2);

//        int a=257;
//        byte b=(byte)(a);
//        257%256=1(max value byte can store is 256)

//        byte a=40;
//        byte b=50;
//        byte c=100;
//        int d=a*b/c;
//        System.out.println(d);
//        here the byte is automatically converted into integer when evaluating , the computer does it

//        int number='A';
//        System.out.println(number);


        byte b=42;
        char c='a';
        short s=1024;
        int i=500000;
        float f=5.67f;
        double d=0.1234;
        double result=(f*b)+(i/c)-(d-s);//f*b is giving f,i/c is giving int.d-s is giving double
        System.out.println((f*b)+" "+(i/c)+" "+(d-s));
        System.out.println(result);



    }
}
