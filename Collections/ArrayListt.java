package Collections;

import java.util.*;
public class ArrayListt {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>(); // List interface  for variable type is preferred 
        //because it promotes implementation over interface rather than specific implemntation
        //This makes our code more flexible and easier to change if we decide to use different implementation i.e of LinkedList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> it = list.iterator();
        //Iterator interface contains two methods
        //1. hasNext which checks if there is next element present in list then returns true  boolean hasNext();
        //2. next which returns the element from list and increases the index of list

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        list.remove(3);
        list.remove(Integer.valueOf(3));

        for (int i : list) {
            System.out.println(i);
        }

    }
}
