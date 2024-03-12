package OOOOOPPPSSSSS.Singleton;

public class Example {
    private Example(){//it will be used only here , not anywhere else

    }
    private static  Example instance;
    public static Example getInstance(){
        if(instance==null){
            instance=new Example();
        }
        return instance;
    }
}
//it is a class which only can create one obj of