package OOOOOPPPSSSSS.StaticExample;

//outside classes cannot be static , only inner classes can be static
//because inner class is dependent on outside class but outside class is not depenedent on anything and hence
//the above statement

class Test{
    String name;

    public Test(String name) {

        this.name = name;
    }
}

public class InnerClasses {
//    static class Test{
//        String name;
//
//        public Test(String name) {
//            this.name = name;
//        }
//    }


    public static void main(String[] args) {
        Test a=new Test("Reet");
        Test b=new Test("Preet");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}

//obj are created at runtime
//static methods are resolved during compile time

//println is a method of printstream
//out is a variable
//system is a class
//arrays is a class which contain a Tostring method