package OOPS;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog dobby=new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
    }
}

class Animals{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class Mammal extends Animals{
    int legs;
}

class Dog extends Mammal{
    String breed;
}

