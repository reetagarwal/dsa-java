package RECURSION;
//write a function that takes in a number and prints it
//print first 5 numbers

public class Numbers {
    public static void main(String[] args) {
        print1(1);
    }

   static void print1(int n) {
       System.out.println(n);
       print2(2);
    }
    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }
    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }
    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }
    static void print5(int n) {
        System.out.println(n);
    }
}
/*Note:
1.While the function is not finished executing it will remain in stack(primitives also stored in stack memory)
2.When a function finishes executing it is removed from the stack and the flow of program is restored to where that func was called
3.
 */