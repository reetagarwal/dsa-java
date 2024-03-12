package OOOOOPPPSSSSS.AbstractClass;

public class Son extends Parent{
    public Son(int age) {
        this.age=age;
    }

    @Override
    void career() {
        System.out.println("i am going to be a scientist");
    }

    @Override
    void partner() {
        System.out.println("i love abc");
    }
}
