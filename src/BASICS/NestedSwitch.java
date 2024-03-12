import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int empId=in.nextInt();
        String department=in.next();
        switch(empId){
            case 1:
                System.out.println("Reet Agarwal");
                break;
            case 2:
                System.out.println("Preet Agarwal");
                break;
            case 3:
                System.out.println("Lucy Agarwal");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department");
                }
            default:
                System.out.println("Enter correct employee id");
        }

    }
}
