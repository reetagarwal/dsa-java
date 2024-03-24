package Stack;

import java.util.Stack;

//very imp question
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int[] nextGreater =new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){//0 to n if asked about left
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=arr[s.peek()];
            }
            s.push(i);//pushing the index not the element
        }
        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }
}

//nextSmaller in rhs:in line 13 reverse the greater than sign
//nextSmaller in lhs:reverse loop  in line 12(0 to n) and line 13 also