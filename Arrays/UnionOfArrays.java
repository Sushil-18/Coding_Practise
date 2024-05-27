//Union of sorted arrays , Union contains all the distinct and common elements from both arrays
import java.util.*;
public class UnionOfArrays {
    public void union(List<Integer> arr, List<Integer> arr1, List<Integer> arr2){
        //Calculating sizes of the lists
        int len = arr.size();
        int len1 = arr1.size();
        //Initializing the two pointers to 0 
        int i = 0, j=0;
        //To avoid arrayOutOfBoundIndex checking if the pointers are always less than the respecitve lists
        while (i < len && j < len1) {
/*             Here we 3 conditions
            1.element from first list is smaller than element from second list
            2.Both elements from both list are equals
            3.element from first list is greater than element from second list */

            if(arr.get(i)<= arr1.get(j)){//checking the first and second condition if any of the above is true
                if(arr2.size() == 0 || arr2.get(arr2.size()-1) != arr.get(i)){ // then check if the list3 is empty or last element from list 3 is not equals to the current element from list1
                    arr2.add(arr.get(i)); // if above conditions satisfys then insert element into list3
                }
                i++; // increment the pointer
            }
            else{ // this is the 3rd condition
                if(arr2.size() == 0 || arr2.get(arr2.size() -1) != arr1.get(j)){ // again checking if the element is already present in the list3
                    arr2.add(arr1.get(j)); //If not insert it in list 3
                }
                 j++; // increment the pointer
            }
            
        }
            //If there are any elements still remaining in the first list then we will insert them as well
            while (i < arr.size()) {
                if(arr2.get(arr2.size()-1) != arr.get(i)){
                    arr2.add(arr.get(i));
                }
                i++;
                
            }

            //If there are any elements still remaining in the second list then we will insert them as well
             while (j < arr.size()) {
                if(arr2.get(arr2.size() -1) != arr1.get(j)){
                    arr2.add(arr.get(j)); 
                }
                j++;
                
            }
            
        //below is the brute force solution , we can use MAP or SET data structure to improve the complexity
        //But the 2 pointer is the best case for this problem
        /* for(int element : arr){
            if(arr2.contains(element)){
                continue;
            }
            else{
                arr2.add(element);
            }
        }

        for(Integer element: arr1){
            if(arr2.contains(element)){
                continue;
            }
            else{
                arr2.add(element);
            }
        }

        Collections.sort(arr2); */

        
    }
    public static void main(String args[]){
        UnionOfArrays obj = new UnionOfArrays();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(11);

        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        List<Integer> list3 = new ArrayList<>();

        obj.union(list1, list2,list3);

        for(int element: list3){
            System.out.println(element);
        }


    }
}
