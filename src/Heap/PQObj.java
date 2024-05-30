package Heap;

import java.util.PriorityQueue;

public class PQObj {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student o) {
            return this.rank-o.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pqq=new PriorityQueue<>();
        pqq.add(new Student("A",4));
        pqq.add(new Student("B",5));
        pqq.add(new Student("C",2));
        pqq.add(new Student("D",12));

        while (!pqq.isEmpty()){
            System.out.println(pqq.peek().name+"->"+pqq.peek().rank);
            pqq.remove();
        }
    }
}
