package RECURSION;
//Find nth fibonacci numbers
public class FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
    static int fibo(int n){

        //base condition
        if(n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }
}

/*NOTE:How to understand and approach a problem
1.Identify if you can break down a problem into smaller problem
2.Write the recurrence relation if needed
3.Draw the recursion tree
4.About the tree:
  a. See the flow of functions , how they are getting in stack
  b.Identify and focus on left tree calls and right tree calls
  c.Draw the tree and pointers again and again using pen and paper
  d.Use a debugger to see the flow
5.See how the values and what type of values are returned at each step
  See where the function call will come out of
  In the end you will come out of the main function
 */