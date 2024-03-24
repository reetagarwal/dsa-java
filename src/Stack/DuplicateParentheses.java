package Stack;

import java.util.Stack;

public class DuplicateParentheses {

    public static boolean isDuplicate(String str) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                int count=0;
                while(stack.peek()!='('){
                    stack.pop();
                    count++;
                }
                if(count<1){
                    return true;//exists
                }
                else{
                    stack.pop();//opening pair pop
                }
            }
            else{
                stack.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str="((a+b))";
        String str2="(a-b)";
        System.out.println(isDuplicate(str));
    }


}
