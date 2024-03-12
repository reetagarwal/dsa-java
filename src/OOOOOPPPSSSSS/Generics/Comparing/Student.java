package OOOOOPPPSSSSS.Generics.Comparing;

public class Student implements Comparable<Student>{
    int rno;
    float marks;

    public Student(int rno, float marks) {
        this.rno = rno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff=(int)(this.marks-o.marks);

        //if diff==0:means both are equal
        //if diff<0:means o is bigger else o is smaller
        return diff;
    }
}
