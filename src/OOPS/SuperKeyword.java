package OOPS;

public class SuperKeyword {
    public static void main(String[] args) {
        Joey j=new Joey();
        System.out.println(j.color);
    }
}
class Friends{
    String color;
    Friends(){
        System.out.println("Friends constructor is called");
    }
}
class Joey extends Friends{
    Joey(){
        super.color="Reddish";
        //super();//calling friends class constructor
        /*
        if you do not write super() then java by default calls super constructor
         */
        System.out.println("Joey constructor is called");
    }
}
