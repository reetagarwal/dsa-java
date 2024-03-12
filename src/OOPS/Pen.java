package OOPS;

public class Pen {
    public static void main(String[] args) {
        Pencil p1=new Pencil();//constructor created a pencil object called p1
        p1.setColor("Blue");//p1.color="Yellow"
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}
class Pencil{
    //properties+function
    String color;
    int tip;
    void setColor(String newcolor){
        color=newcolor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}

