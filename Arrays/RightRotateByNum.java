import java.util.*;
public class RightRotateByNum {

    public void reverse(List<Integer> arr,int start, int end){
        while (start < end) {
            /* Collections.swap(arr, start, end);
            start += 1;
            end -= 1; */
            //Swapping two numbers in arraylist without using inbuild method or third variable
            arr.set(start,arr.set(end,arr.get(start)));
            start += 1;
            end -= 1;
        }
    }
    public void rotateByNumber(List<Integer> arr, int num){

        /* If you want to rotate the array from right then reverse the array from the start till length - numByWhichToRotate 
        then reverse the remaining array after that reverse the whole array */

        /* If you want to rotate the array from left then reverse the array from length-1 to numByWhichToRotate  then
          reverse the remaining array afte that reverse the whole array
        */
        int length = arr.size();

        if(length <= 1 || num > length){
            return;
        }
        //reverse the array from o to length - num - 1
        reverse(arr, 0, length - num -1);
        //reverse the array from length-num to length - 1
        reverse(arr,length-num, length-1);
        ////reverse the array from o to length - 1
        reverse(arr, 0, length-1);
        
    }
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(63);
        list.add(65);
        list.add(94);
        list.add(11);
        list.add(9);

        RightRotateByNum obj = new RightRotateByNum();
        int numberToBeRotatedBy = 2;

        System.out.println("ArrayList before moving elements to Right by "+numberToBeRotatedBy);

        for(int element : list){
            System.out.println(element);
        }

        obj.rotateByNumber(list,numberToBeRotatedBy);

        System.out.println("ArrayList after moving elements to Right by "+numberToBeRotatedBy);

         for(int element : list){
            System.out.println(element);
         }

    }
}
