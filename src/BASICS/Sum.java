import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1=input.nextInt();
        System.out.println("enter the second number");
        int num2=input.nextInt();
        int sum=num1+num2;

        System.out.println("the sum is "+sum);
    }
}
