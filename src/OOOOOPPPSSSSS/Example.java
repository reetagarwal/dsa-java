package OOOOOPPPSSSSS;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        Student[] students=new Student[5];
//        Student Reet;//declaring
//        Reet =new Student();
        Student reet=new Student();
        reet.rno=2205057;
        reet.name="Reet Agarwal";
        reet.marks=88.5f;
        System.out.println(reet.rno);
        System.out.println(reet.name);
        System.out.println(reet.marks);
       // System.out.println(Arrays.toString(students));
    }
}

class Student{
    int rno;
    String name;
    float marks;
}
