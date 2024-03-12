package RECURSION;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digits(678));
    }

    static int digits(int n) {
        if(n==0){
            return 0;
        }
        return digits(n/10)+(n%10);
    }
}
