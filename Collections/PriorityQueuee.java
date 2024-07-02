import java.util.*;
public class PriorityQueuee {
    public static void main(String args[]){
        Queue<Integer> priorityQueue = new PriorityQueue<>(); // we can pass any lambda function as comparator while creating queue
        //By default priority of numbers in priorityqueue is natural order.

        priorityQueue.offer(64);   // offer is used to insert the element in queue.
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

        System.out.println(priorityQueue.peek()); //peek method retrives head of the queue

       while (!priorityQueue.isEmpty()) { // We can check if queue is empty or not by using queue.isEmpty() method.
        System.out.println(priorityQueue.poll());  //poll method retrives and deletes the head of queue.
       }



    }
}
