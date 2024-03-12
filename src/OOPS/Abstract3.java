package OOPS;

public class Abstract3 {
    public static void main(String[] args) {
       Mustang myOrangess=new Mustang();
       //Fruits->Orange->Mustang
    }
}

abstract class Fruitss {
    Fruitss(){
        System.out.println("Fruitss constructor called");
    }
}
class Orangess extends Fruitss {
    Orangess(){
        System.out.println("Orange constructor is called");
    }
}

class Mustang extends Orangess{
    Mustang(){
        System.out.println("Constructor called");
    }
}
