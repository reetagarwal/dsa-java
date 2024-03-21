package Stack;

import java.util.Stack;

public class Reverse {
    public static String reverseString(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        //reversing
        StringBuilder result=new StringBuilder();
        while (!s.isEmpty()){//till the stack is not empty
            char rev=s.pop();
            result.append(rev);
        }
        //storing
        return result.toString();//since we took in stringbuilder way that is why using toString()
    }

    public static void main(String[] args) {
        String str="abc";
        String result=reverseString(str);
        System.out.println(result);
    }
}
