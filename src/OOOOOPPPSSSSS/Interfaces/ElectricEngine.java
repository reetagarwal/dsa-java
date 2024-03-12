package OOOOOPPPSSSSS.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric method starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric method stops");
    }

    @Override
    public void acc() {
        System.out.println("Electric method accelerates");
    }
}
