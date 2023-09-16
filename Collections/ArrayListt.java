package Collections;

import java.util.*;
public class ArrayListt {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> it = list.iterator();

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
