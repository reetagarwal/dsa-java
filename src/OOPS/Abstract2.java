package OOPS;

public class Abstract2 {
        public static void main(String[] args) {
            Oranges o=new Oranges();
            o.healthy();
            o.shape();
            System.out.println(o.color);
            Apples a=new Apples();
            a.healthy();
            a.shape();
            System.out.println(a.color);
        }
}

    abstract class Fruits {
    String color;
        Fruits(){
            color="peach";
        }
        void healthy() {//non-abstract methods
            System.out.println("Fruits are healthy");
        }

        abstract void shape();
        //the function walk only gives the idea , the actual implementation depends on orange and apple
    }
    class Oranges extends Fruits {
        void changecolor(){
            color="Orange";
        }
        void shape(){
            System.out.println("It's round in shape");
        }
    }

    class Apples extends Fruits {
    void changecolor(){
        color="Red";
    }
        void shape(){
            System.out.println("It's uhm weird oval shape");
        }
    }

//constructor work:
//child class ke object ke kuch variables ko initialise krna bhi ho skta not just initialise object
//top to bottom the properties initialisation is done within inheritance heirarchy