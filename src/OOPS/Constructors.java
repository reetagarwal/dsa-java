package OOPS;

public class Constructors {
    public static void main(String[] args) {
        Students s1=new Students();
        s1.name="Reet";
        s1.roll=2205057;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=98;
        /*this won't exist
        Students s4=new Students("Reet",2205057);
         */
        Students s2=new Students(s1);//trying to copy s1 into s2
        s2.password="xyz";
        s1.marks[2]=100;
        for(int i=0;i<3;i++){
           System.out.println(s2.marks[i]);
        }
    }
}

class Students{
    String name,password;
    int roll;
    int[] marks;
    //shallow copy
//    Students(Students s1){//making a constructor
//        marks=new int[3];
//        this.name=s1.name;
//        this.roll=s1.roll;
//        this.marks=s1.marks;
//    }

    //deep copy
    Students(Students s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
    Students(){//non-parameterized
        marks=new int[3];
        System.out.println("Constructor");
    }
    Students(String name){//parametrized
        marks=new int[3];
        this.name=name;
    }
    Students(int roll){
        marks=new int[3];
        this.roll=roll;
    }
}
