package OOOOOPPPSSSSS;

public class Hello {
    public static void main(String[] args) {
        Greeting greet=new Greeting();
        greet.greeting();
        greet.changeName("Preet");
        greet.greeting();
    }
}
 class Greeting{
    String name;
    int rno;
    float marks;
    void greeting(){
        System.out.println("Hello, my name is"+ this.name);
    }

    void changeName(String newName){
        name=newName;
     }

     Greeting(){
        this.name="Reet";
        this.rno=2205057;
        this.marks=67.8f;
     }

     Greeting(String naam,int roll,float mark){
         name=naam;
         rno=roll;
         marks=mark;
     }

 }