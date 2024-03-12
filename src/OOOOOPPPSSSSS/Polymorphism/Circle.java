package OOOOOPPPSSSSS.Polymorphism;

public class Circle extends Shapes{

    //this will run when obj of circle is created
    //hence it will overriding the parent method
    @Override//this is called annotation and this is used for check purposes
    void area(){
        System.out.println("I am in circle");
    }



}
