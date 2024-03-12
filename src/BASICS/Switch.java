import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruit=in.next();
//        if(fruit.equals("mango")){
//            System.out.println("king of fruit");
//        }
//        if(fruit.equals("apple")){
//            System.out.println("Sweet and red");
//        }
        //instead of the above we could use switch since it looks very repetitive

        //for the below syntax after you finish writing the switch code just do alt and enter you get options for enhanced switch
        switch (fruit) {
            case "Mango" -> System.out.println("king if fruits");
            case "Apple" -> System.out.println("Red and sweet");
            case "Orange" -> System.out.println("Orange and round");
            case "Grapes" -> System.out.println("Small and tasty");
            default -> System.out.println("Invalid choice");
        }
        int day=in.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }

    }
}
