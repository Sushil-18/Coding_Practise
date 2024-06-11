import java.util.*;

public class Counting {

    public static void countingSort(int[] arr) {
        int max = 0;
        //finding the maximum element so we can delcare an counting array
        for (int element : arr) {
            max = Math.max(max, element);
        }
        int[] countingArray = new int[max + 1]; //declaration of counting array

        for (int i = 0; i < arr.length; i++) { //Filling the countingArray
            countingArray[arr[i]]++;
        }
        for (int i = 1; i < countingArray.length; i++) { // creating prefix of counting array
            countingArray[i] = countingArray[i - 1] + countingArray[i];
        }

        int[] outputArray = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            if (countingArray[arr[i]] > 0) {
                outputArray[countingArray[arr[i]] - 1] = arr[i];
                countingArray[arr[i]]--;
            }
        }
        System.out.println("Array after sorting");
        for (int element : outputArray) {
            System.out.println(element);
        }
    }

    public static void main(String args[]) {
        int[] arr = { 6, 3, 1, 5, 6, 7, 1, 4 };

        System.out.println("Array before sorting");
        for (int element : arr) {
            System.out.println(element);
        }
        countingSort(arr);
    }
}
