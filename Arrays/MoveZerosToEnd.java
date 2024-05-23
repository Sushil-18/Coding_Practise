import java.util.*;

public class MoveZerosToEnd {
    public void moveZeros(List<Integer> arr){
        int j = 0;
        for(Integer element : arr){
            if(element != 0){
                /* Collections.swap takes 3 parameters 
                 1.The list on which swap will be used
                 2.The index of element which will be swapped
                 3.The index of second element which will be swapped
                */
                Collections.swap(arr,arr.indexOf(element) , j);
                j++;
            }
        }
    }
    public static void main(String args[]){
        MoveZerosToEnd obj = new MoveZerosToEnd();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(2);
        list.add(0);
        list.add(3);
        list.add(0);
        list.add(4);
        list.add(0);

        System.out.println("Array before moving zeros to end of the array");

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        obj.moveZeros(list);

        System.out.println("Array after moving zeros to end of the array");

        for(int element : list){
            System.out.print(element+" ");
        }

    }
}
