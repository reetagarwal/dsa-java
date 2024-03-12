package RECURSION;

public class ProOfDigits {
    public static void main(String[] args) {
        System.out.println(pro(13420));
    }

    static int pro(int n) {
        if(n%10==n){//1 digit remaining
            return n;
        }
        return (n%10)*pro(n/10);
    }
}
