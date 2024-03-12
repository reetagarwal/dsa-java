package FUNCTIONS;

public class Shadowing {
    static int x=90;//we cannot use object dependent things in object independent things that is why we wrote static
    //the above line will be shadowed by line 9
    public static void main(String[] args) {
        System.out.println(x);//90
        int x=40;//the class variable at line 4 is shadowed by this
        System.out.println(40);//40
        fun();
    }
    //scope will begin when value is initialised

    static void fun(){
        System.out.println(x);//90
    }
}
