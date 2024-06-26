import java.util.*;
public class Stack {
    public static void main(String args[]){
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(45);
        stack.push(64);
        stack.push(82);
        stack.push(90);
        stack.push(18);

        for(Integer element : stack){
            System.out.println(element);
        }

        System.out.println("poping the head of the stack"+ stack.pop());

        System.out.println("Stack after pop operation");

         for(Integer element : stack){
            System.out.println(element);
        }
    }
}
