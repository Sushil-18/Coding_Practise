import java.util.Stack;
//This is the similar problem as the parenthesis problem.

public class MinLenght {
    public int minLength(String str){
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < str.length(); i++){
            if(stack.empty()){
                stack.push(str.charAt(i));
                continue;
            }
            if(stack.peek() == 'A' && str.charAt(i) == 'B' || stack.peek() == 'C' && str.charAt(i) == 'D'){
                stack.pop();
            }
            else{
                stack.push(str.charAt(i));
            }
        }
        return stack.size();
    }
    public static void main(String args[]){
        MinLenght obj = new MinLenght();
        String str = "ABFCACDB";
        int length = obj.minLength(str);
        System.out.println(length);
    }
}
