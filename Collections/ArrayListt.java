

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

        //for each loop implements the Iteratoro interface i.e it can be used to iterate ovdr list interface,
        // Internally it uses hasNext and next methods of Iterator interface
        for (int i : list) {
            System.out.println(i);
        }

    }
}

/*  Methods which can be used in ArrayList 
1.int Size() - It returns the size of the list
2.boolean isEmpty() - returns true if list is empty
3.boolean contains(Object o) - returns true if element is present in list
4.Iterator<T> iterator() - returns iterator which can be used to iterate over the list
5.Object[] toArray() - returns array of object type which contains all elements from list
6.void add(element) - appends element at the end of list or void add(int index, E elements) - adds element of type E at specifid index
7.boolean remove(element) - removes element from the list
8.void clear() - clears the list i.e removes all elements from the list
9.E get(int index) - returns element of type E from specified index
10.E set(int index, E element) - replaces the element of type E at the specified index
11.int indexOf(object O) -returns the first occurance index of specified element or int lastIndexOf(Object o) - returns last occurance index of object 
12.List<E> sublist(int startIndex, int LastIndex) - returns shallow copy of list from startindex to lastindex which is exlusive

'*/
