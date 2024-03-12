package OOOOOPPPSSSSS.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    static void message(){
        System.out.println("hello world");
        //System.out.println(this.name);
        //cannot use as this is a object and static itself doesn't depend on object
    }
    public Human(int age, String name,int salary, boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
       Human.population+=1;
    }
}
//you cannot access non-static stuff without referencing their instances in a static context