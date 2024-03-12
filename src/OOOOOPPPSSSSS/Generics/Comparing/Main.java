package OOOOOPPPSSSSS.Generics.Comparing;

public class Main {
    public static void main(String[] args) {
        Student reet=new Student(2205057,90.8f);
        Student preet=new Student(2205058,98.1f);

        if(reet.compareTo(preet)<0){
            System.out.println(reet.compareTo(preet));
            System.out.println("Preet has more marks");
        }

    }
}


/*
If 2 data are same the method must return zero(0).
If 1st data is greater than 2nd data the method must return +1.
If 1st data is smaller than 2nd data the method must return -1.
 */
