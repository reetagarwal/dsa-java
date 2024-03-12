package OOOOOPPPSSSSS.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box=new Box();
//        System.out.println(box.l+" "+ box.w+" "+ box.h);
//        BoxWeight box2=new BoxWeight();
//        System.out.println(box2.h+" "+ box2.weight);
//        BoxWeight box3=new BoxWeight(2,3,4,5);
//        System.out.println(box3.l+" "+box3.h+" "+ box3.w+" "+ box3.weight);
//
//        Box box5=new BoxWeight(2,3,4,5);
//        System.out.println(box5);
        // we refer to the reference variable(lhs) and not the object(rhs)

//        BoxWeight box6=new Box(1,2,3);
//        System.out.println(box6);
        //the above two lines will give error why?
        //there are many variables in both parent and child class
        //you are given access to variables that are in the ref type i.e BoxWeight
        //hence, you should have access to weight variable
        //this also means that you are trying to access should be initialised
        //but here, when the obj itself is of type parent class , how will you call the constructor
        //this is why error
        //So you cannot have a child reference variable and a parent object



        BoxPrice box7=new BoxPrice(5,8,200);
        System.out.println(box7.cost+" "+ box7.weight+" "+ box7.w+" "+ box7.h+" "+ box7.l);
    }
}
