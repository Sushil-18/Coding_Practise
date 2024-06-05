//Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.

import java.util.ArrayList;
import java.util.List;

public class MaximumConsecutive {
    public int findMaxConsecutive(List<Integer> arr){
        int maxCount = 0;
        int count = 0;
        int len = arr.size();

        for(int i=0 ; i< len;i++){
            if(arr.get(i)==1){
                count += 1;
            }
            else{
                count = 0;
            }
           maxCount = Math.max(maxCount, count);
        }

        return maxCount;

    }
    public static void main(String args[]){
        MaximumConsecutive obj = new MaximumConsecutive();
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(0);

        

        System.out.println(obj.findMaxConsecutive(list));

    }
}