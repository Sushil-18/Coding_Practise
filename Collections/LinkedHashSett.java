import java.util.*;
//LinkedHashset keeps the elelment in order which they are inserted, 
//but it reduces performance compaired to HashSet because of it maintains linkedlist for ordering 
//although the time complexity it same

class LinkedHashsett {

    public static void main(String[] args) {
        HashSet<String> h = new LinkedHashSet<String>();

        h.add("India");
        h.add("Australia");
        h.add("South Africa");

        h.add("India");

        System.out.println(h);
        System.out.println("List contains India or not:" + h.contains("India"));

        h.remove("Australia");
        System.out.println("List after removing Australia:" + h);

        System.out.println("Iterating over list:");

        // Iterating over hashSet items
        Iterator<String> i = h.iterator();

        while (i.hasNext()) System.out.println(i.next());
    }
}
