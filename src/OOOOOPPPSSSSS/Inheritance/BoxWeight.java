package OOOOOPPPSSSSS.Inheritance;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight(){
        this.weight=-1;
    }


    //reference type is box
    //Box(Box old)
    BoxWeight(BoxWeight other){
        super(other);
        weight= other.weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);//what is this?call the parent class constructor
        //used to initialise values present in parent class

       // System.out.println(super.weight);

        this.weight = weight;
    }

    BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }
}

//super keyword:
//you can call the super class constructor
//you can use when explicitly you want to refer to parent class
//super class doesn't care about the base class
//child class cares about parent class