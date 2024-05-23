import java.util.*;

public class MoveZerosToEnd {
    public void moveZeros(List<Integer> arr){
        int length = arr.size();
        for(int i=0; i< length-1; i++){
             int j = i + 1;
            if(arr.get(i) == 0 && arr.get(j) !=0 ){
                Collections.swap(arr, i, j);
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
