package OOOOOPPPSSSSS;

import javax.xml.namespace.QName;

public class Constructor {
    public static void main(String[] args) {
        Student reet=new Student();
        System.out.println(reet.marks);
        System.out.println(reet.name);
        System.out.println(reet.rno);
    }
}

class stu{
    int rno;
    String name;
    float marks;
    stu(){
        this.rno=2205057;
        this.name= "Reet";
        this.marks=89.9f;


    }
}
