package OOOOOPPPSSSSS.AbstractClass;

public class Main {
    public static void main(String[] args) {
        Son son=new Son(30);
        son.career();

        Daughter daughter=new Daughter(25);
        daughter.career();

        Parent daughter2=new Daughter(30);
        daughter2.partner();



    }
}

// Parent mom=new Parent();
//cannot create objects of abstract class
//abstract constructors not allowed
//abstract static methods not allowed,since static cannot be overriden and abstract classes are overriden
//But you could do static void hello()
//if atleast one of the method is abstract then the class needs to be abstract as welll
//you cannot have a final abstract class
//multiple inheritance not allowed