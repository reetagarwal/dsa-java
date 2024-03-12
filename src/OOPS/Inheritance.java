package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
    }
}
//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

//Derived class or subclass
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}