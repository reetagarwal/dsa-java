package FUNCTIONS;

public class BinaryToDecimal {
    public static void BinToDec(int binNum) {
        int myNum=binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int ld=binNum%10;
            decNum+=ld*(int)Math.pow(2,pow);//typecasting is done since pow takes double
            pow++;//increament of power
            binNum=binNum/10;//shortening of the number
        }
        System.out.println("decimal of "+myNum+" = "+decNum);
    }
    public static void main(String[] args) {
        BinToDec(101);
    }
}
