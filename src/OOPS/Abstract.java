package OOPS;

public class Abstract {
    public static void main(String[] args) {
        Orange o=new Orange();
        o.healthy();
        o.color();
        Apple a=new Apple();
        a.healthy();
        a.color();

    }
}

abstract class Fruit {
    void healthy() {//non-abstract methods
        System.out.println("Fruits are healthy");
    }

    abstract void color();
    //the function walk only gives the idea , the actual implementation depends on orange and apple
}
class Orange extends Fruit{
    void color(){
        System.out.println("It's name and color both are orange");
    }
}

class Apple extends Fruit{
    void color(){
        System.out.println("It's color is red");
    }
}