package OOOOOPPPSSSSS.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car=new Car();

//        car.a
        //not possible

//        car.acc();
//        car.start();
//        car.stop();
//
//        Media carMedia=new Car();
//        carMedia.stop();

        NiceCar car=new NiceCar();
        car.start();
        car.startMusic();
    }
}


//which particular method it needs to run , it determines at runtime
//interfaces doesn't care if the two classes are related or not, but normally it is taken into consideration
//two classes that are unrelated to each other can also implement the same interfaces
//which version to access is told by the object and what to access is told by reference variable
