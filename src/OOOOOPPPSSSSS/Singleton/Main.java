package OOOOOPPPSSSSS.Singleton;

public class Main {
    public static void main(String[] args) {
//        Example obj=new Example();
//        obj.num;
        //ypu cannot do the above as example is private and will be used there only
        Example obj=Example.getInstance();
        Example obj2=Example.getInstance();
        Example obj3=Example.getInstance();
        //all three reference variables are pointing towards one object
    }
}

