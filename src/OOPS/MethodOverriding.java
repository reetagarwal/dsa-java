package OOPS;

public class MethodOverriding {
    public static void main(String[] args) {
        Streets s=new Streets();
        s.cycle();//only calls child class
    }
}

class Street{
    void cycle(){
        System.out.println("Cycle anywhere");
    }
}
class Streets{
    void cycle(){
        System.out.println("Cycle only on side");
    }
}
