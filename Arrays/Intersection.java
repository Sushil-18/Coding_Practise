import java.util.*;
public class Intersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> temp = new ArrayList<>();

        int i = 0 , j = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                temp.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[temp.size()];
        for(int k = 0; k < temp.size(); k++){
            result[k] = temp.get(k);
        }
        return result;
    }
    public static void main(String args[]){
        Intersection obj = new Intersection();

        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};

        int[] result = obj.intersect(arr1, arr2);

        for(int element : result){
            System.out.println(element);
        }
        
    }
}
