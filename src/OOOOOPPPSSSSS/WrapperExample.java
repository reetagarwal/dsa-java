package OOOOOPPPSSSSS;

public class WrapperExample {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        Integer num=45;//wrapper class

        Integer c=30;
        Integer d=40;
        swap(a,b);
        swap2(c,d);
        System.out.println(a+" "+b);
        System.out.println(c+" "+d);
        final A reet=new A("Reet Agarwal");
        reet.name="other name";

        //when a non-primitive is final , you cannot reassign it
        //reet=new A(new object)

        A obj;
        for(int i=0;i<1000000;i++){
            obj=new A("Random name");
        }

    }


    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }

    static void swap2(Integer a,Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }
}

class A{
    final int num=10;
    String name;
    public A(String name){
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}