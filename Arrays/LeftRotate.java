//Rotate an array to left by one
/**
 * LeftRotate
 */
import java.util.*;
public class LeftRotate {
    public void rotateLeftByOne(List<Integer> arr,int len){
        if(len == 1){
            return ;
        }
        int temp = arr.get(0);
        for(int i=0; i < len-1 ; i++){
            arr.set(i,arr.get(i+1));
        }
        arr.set(len-1, temp);
    }
    public static void main(String args[]){
        List<Integer> arr = new ArrayList<>();

        arr.add(4);
        arr.add(56);
        arr.add(54);
        arr.add(76);
        arr.add(65);
        arr.add(1);

        int length = arr.size();

        System.out.println("Array before rotating to left by one");
        //Using for each loop to iterate over an ArrayList
        for(int element : arr){
            System.out.print(element +" ");
        }

        LeftRotate obj = new LeftRotate();
        obj.rotateLeftByOne(arr,length);

        System.out.println();
        System.out.print("Array after rotating to left by one");
        System.out.println();
        //Using Iterator to iterate over an ArrayList
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
           int item =  it.next();
           System.out.print(item+" ");
        }
    }
    
}