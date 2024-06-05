import java.util.ArrayList;
import java.util.List;
//Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
public class NumberAppearsOnce {
    public int numberAppearsOnce(List<Integer> arr){
        int num = 0;
        for(int element: arr){
            num = element ^ num; //XOR of same number returns zero, So the numbers which are twice will be eleminted.
        }

        return num;
    }
    public static void main(String args[]){
        NumberAppearsOnce obj = new NumberAppearsOnce();
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(4);

        System.out.println(obj.numberAppearsOnce(list));
    }
}
