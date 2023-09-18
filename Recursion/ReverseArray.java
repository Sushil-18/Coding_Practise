package Recursion;
class Reverse {
    public void reverse(int[] array,int start,int end) {
        if (start > end)
            return;
        int temp = array[start];
        array[start]=array[end];
        array[end]=temp;
        reverse(array,start+1,end-1);
    }

    public void print(int[] array) {
        for (int elements : array) {
            System.out.print(elements + " ");
        }
    }
}
public class ReverseArray {
    public static void main(String args[]) {
        Reverse obj = new Reverse();
        int[] arr = { 1, 2, 3, 4, 5 };
        int start = 0;
        int end = arr.length - 1;
        //Dynamic way to initialize an array 
        // int[] array = new int[size]; size is number of elements in array
        obj.reverse(arr, start, end);
        obj.print(arr);
    }
}
