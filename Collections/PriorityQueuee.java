import java.util.*;
public class PriorityQueuee {
    public static void main(String args[]){
        Queue<Integer> priorityQueue = new PriorityQueue<>(); // we can pass any lambda function as comparator while creating queue
        //By default priority of numbers in priorityqueue is natural order.

        priorityQueue.offer(64);
        priorityQueue.offer(74);
        priorityQueue.offer(9);
        priorityQueue.offer(45);
        priorityQueue.offer(54);
        priorityQueue.offer(18);


        /* we should not traverse over a priority queue as it will result in random ordering of elements though the acutal order is 
        natural order */

        /* for(Integer element: priorityQueue){ 
            System.out.println(element);  
        } */

        System.out.println(priorityQueue.peek());

       while (!priorityQueue.isEmpty()) {
        System.out.println(priorityQueue.poll());
       }



    }
}
