package OOPS;

public class Student {
    public static void main(String[] args) {
        Stu s1=new Stu();//creating a new student object with the help of the parenthesis
        //System.out.println(s1.name);
    }
}
class Stu{
    String name;
    int roll;
    Stu(){//Stu(String name)
        //this.name=name;
        System.out.println("Constructor is called");
    }
}
