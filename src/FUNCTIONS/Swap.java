package FUNCTIONS;

public class
Swap {
    public static void SwapNumbers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A is:" + a);
        System.out.println("B is:" + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        SwapNumbers(a, b);
    }

}

//    the below won't give the swapped value,it'll give the original a and b value
//    public static void SwapNumbers(int a,int b){
//        int temp=a;
//        a=b;
//        b=temp;
//    }
//
//    public static void main(String[] args) {
//        int a=10;
//        int b=5;
//        SwapNumbers(a,b);
//        System.out.println("A is:"+a);
//        System.out.println("B is:"+b);
//    }
//}
