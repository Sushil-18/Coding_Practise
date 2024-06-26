import java.util.*;
public class Queuee {
    public static void main(String args[]){

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(2);
        queue.offer(64);
        queue.offer(93);
        queue.offer(99);
        queue.offer(46);

        System.out.println("Queue before removal of head");

        System.out.println(queue);

        Integer element = queue.peek();
        System.out.println(element);

        queue.poll();

        System.out.println("Queue after removal of head");
        System.out.println(queue);

        for(Integer e : queue){    // we can iterator for all the collection interfaces and for-each loop is shorthand for iterator
            System.out.println(e);
        }
    }
}
