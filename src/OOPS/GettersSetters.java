package OOPS;

public class GettersSetters {
    public static void main(String[] args) {
        Pencill p1=new Pencill();
        p1.setColor("Blue");
        System.out.println(p1.getcolor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}

class Pencill{
    private String color;
    private int tip;
    String getcolor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newcolor){
        color=newcolor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
