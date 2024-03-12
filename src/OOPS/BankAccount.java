package OOPS;

//just a simple code to show access modifiers
public class BankAccount {
    public static void main(String[] args) {
        BA myAcc=new BA();
        myAcc.username="ReetAgarwal";
        myAcc.setPassword("abcdefgh");
        //myAcc.password won't work as password is private
    }
}
class BA{
    public String username;
    private String password;
    public void setPassword(String pswd){
        password=pswd;
    }
}
