package FUNCTIONS;

public class PrimeRange {
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){//for(int i=2;i*i<=n;i++)
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void PrimesInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PrimesInRange(100);//since we aren't returning anything we can simply call the function instead of printing
    }
}
