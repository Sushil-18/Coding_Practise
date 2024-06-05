//Finding the missing number from an array
//Problem Statement - Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N.
//Find the number(between 1 to N), that is not present in the given array.
//Additionally we use XOR approach to solve this problem
//XOR of same numbers results in zero value
import java.util.*;
public class FindMissingNumber {
    public int findNumber(List<Integer> arr, int num){
        int total =0;
        int ActualTotal =0;
        //We will calculate sum of all arrray elements
        for(int element : arr){
            total = total + element;
        }
        //Now we will calcualte the sum of first n natural number using formula
        ActualTotal = num*(num+1)/2;
        // We will subtract the sum of n natural numbers from sum of array elements and we will have the missing number
        return ActualTotal - total;
    }
    public static void main(String args[]){
        FindMissingNumber obj = new FindMissingNumber();
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);

        int num = 5;

        int missingNumber = obj.findNumber(list,num);

        System.out.println("The missing number in the array is "+missingNumber);
    }
}
