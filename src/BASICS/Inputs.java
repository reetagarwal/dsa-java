import java.sql.SQLOutput;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int rno=input.nextInt();
        System.out.println("your roll number is "+rno);

        String name=input.next();
        System.out.println(name);
    }
}
