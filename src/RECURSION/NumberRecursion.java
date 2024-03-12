package RECURSION;

public class NumberRecursion {
    public static void main(String[] args) {
        print(1);
    }

   static void print(int i) {
        //base condition:where the recursion will stop making new calls
        if(i==6){//to print numbers only till 5
            return;
        }

       System.out.println(i);

        //tail recursion-last function call
       print(i+1);
    }
}
/*
Recursion : A function that called itself is called recursion
1. every function call takes memory separately
2. no base condition;function calls will keep happening;stack will keep getting filled;
   every call of a function takes memory;memory of computer will keep exceed the limit knows as stack overflow
 */

/*
Why Recursion?
1. It helps us in solving bigger complex problems in a simple way
2. You can convert recursion solutions into iteration(loops) and vice versa
3. Space complexity is not constant because of recursive calls
4. It helps us in breaking down bigger problems into smaller problems
 */

/*Visualising Recursion
main()->print(1)->print(2)->print(3)->print(4)->print(5)
then bottom to up
 */


/*
1.Break it down into smaller problems
2.Recurrence relation
3.Recursive Tree
4.Base condition is represented by answers we already have
 */