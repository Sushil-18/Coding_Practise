//In java collections LinkedList is implemented using doubley linked list
// LInkedList does have all the list methods and it also have it's own methods
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListt {

    public static void main(String args[]) {
        List<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(5);
        list.add(87);
        list.add(12);
        list.add(86);
        list.remove(4);
        list.add(92);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
