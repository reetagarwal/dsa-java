package OOPS;

public class StaticKeyword {
    public static void main(String[] args) {
        College c1=new College();
        c1.collegeName="KIIT";
        College c2=new College();
        System.out.println(c2.collegeName);
        College c3=new College();
        c1.collegeName="IIT";
    }
}
class College{
    static int returnPercentage(int math,int phy,int chem){
        return (math+phy+chem)/3;
    }
    String name;
    int roll;
    static String collegeName;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }

}
