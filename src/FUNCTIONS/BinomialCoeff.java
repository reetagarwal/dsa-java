package FUNCTIONS;

public class BinomialCoeff {
    public static int factorial(int n) {
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int bincoeff(int n,int r) {
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int n_minus_r_fact=factorial(n-r);
        int binomial=n_fact/(r_fact*n_minus_r_fact);
        return binomial;
    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
        int binomial=bincoeff(n,r);
        System.out.println("The binomial coefficient is:"+binomial);
    }
}
