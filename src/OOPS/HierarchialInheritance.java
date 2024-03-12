package OOPS;

public class HierarchialInheritance {
    public static void main(String[] args) {
        Fishes shark=new Fishes();
        shark.eat();
        Bird crow=new Bird();
        crow.fly();
    }
}

class Animalss{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class Mammals extends Animals{
    void walk(){
        System.out.println("Walks");
    }
}

class Fishes extends Animalss{
    void swim(){
        System.out.println("Swims");

    }
}

class Bird extends  Animals{
    void fly(){
        System.out.println("Flies");
    }
}


