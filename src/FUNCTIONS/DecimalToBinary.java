package FUNCTIONS;

public class DecimalToBinary {
    public static void DecToBin(int DecNum) {
        int MyNum=DecNum;
        int pow=0;
        int BinNum=0;
        while(DecNum>0){
            int rem=DecNum%2;
            BinNum+=rem*(int)Math.pow(10,pow);
            pow++;
            DecNum/=2;
        }
        System.out.println("Binary number of "+ MyNum +" = "+BinNum);
    }
    public static void main(String[] args) {
        DecToBin(12);

    }
}
