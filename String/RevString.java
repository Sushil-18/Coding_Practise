//leetcode - 1190 : Reverse substring between each pair of parentheses

import java.util.Stack;

public class RevString {
    public String reverseParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder str = new StringBuilder();

        for(char currentChar : s.toCharArray()){
            if(currentChar == '('){
                stack.push(str.length());
            }
            else if(currentChar == ')'){
                int start = stack.pop();
                reverse(str,start,str.length()-1);
            }
            else{
                str.append(currentChar);
            }
        }
        return str.toString();
    }

     private void reverse(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start++, sb.charAt(end));
            sb.setCharAt(end--, temp);
        }
    }

    public static void main(String args[]){
        RevString obj = new RevString();

        String str = "(u(love)i)";

        System.out.println(obj.reverseParentheses(str));
    }
}
