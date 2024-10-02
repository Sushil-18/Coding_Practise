import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayRankTransform {

    public int[] transformArrayRank(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        // These stream methods will work on given array and will return an array of unique elements in sorted order
        //int[] sortedDistinctArray = Arrays.stream(arr).distinct().sorted().toArray();  

        int[] sortedArray = arr.clone(); //cloning the array
        Arrays.sort(sortedArray); //sorting the array

        int Rank = 1;  //Inserting the unique elements array and there values as Rank
        for(int element: sortedArray){
            if(!map.containsKey(element)){
                map.put(element,Rank++);
            }
        }
        for(int i = 0; i < arr.length; i++){ 
            arr[i] = map.get(arr[i]);       //Inserting the rank of the array values at there posotion
        }

        return arr;  //return the array
    }
    public static void main(String args[]){
        ArrayRankTransform art = new ArrayRankTransform();

        int[] arr = {37,12,28,9,100,56,80,5,12};

        int[] transformedArray = art.transformArrayRank(arr);

        System.out.println(Arrays.toString(transformedArray));

        /* for(int element: transformedArray){
            System.out.println(element);
        } */
    }
}
