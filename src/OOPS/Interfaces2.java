package OOPS;

public class Interfaces2 {
    public static void main(String[] args) {
        Bear b=new Bear();
        b.color();
        b.eats();
    }
}
interface Herbivore{
    void eats();
}
interface Carnivore{
    void color();
}
class Bear implements Herbivore,Carnivore{//using , any number of interfaces you can write
    public void eats() {
        System.out.println("Eats only grases");
    }
    public void color() {
        System.out.println("White and black in color");
    }
}
