package RECURSION;
//return the number of steps to reduce a number to zero
public class Steps {
    public int numberOfSteps(int num){
        return helper(num,0);
    }

    private int helper(int num, int step) {
        if(num==0){
            return step;
        }
        if(num%2==0){
            return helper(num/2,step+1);
        }
        return helper(num-1,step+1);
    }
}
/*
dividing the number by 2 is one step
subtracting one from it is another step
 */