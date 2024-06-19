//Boyer-Moore Majority Voting Algorithm 

import java.util.HashMap;
import java.util.Map;

public class VotingAlog {
    //This solution uses Boyer-moore majority voting algo, we can solve the same problem with the help of hashmap as well
     public int majorityElement(int[] nums) {
        int count = 0;
        int majorityElement = -1;
        for(int element: nums){
            if(count == 0 ){
                majorityElement = element;
                count += 1;
            }
            else{
                if(majorityElement == element){
                    count += 1;
                }
                else{
                    count -= 1;
                }
            }
        }

        int max = 0;
        for(int element: nums){
            if(majorityElement == element){
                max += 1;
            }

            if(max > nums.length/2) return majorityElement;
        }

        return -1;
    }
    //HashMap Solution
   /*  
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length; i++){
            int count = map.getOrDefault(nums[i],0)+1;
        map.put(nums[i],count);
        }
        int max = 0;
        for(Map.Entry mapElement:map.entrySet()){
            max = Math.max(max,(int)mapElement.getValue());
            if(max > nums.length/2){
                return (int)mapElement.getKey();
            }
        }

        return -1;
    } */
    public static void main(String args[]){
        int[] nums = {2,2,1,1,1,2,2};

        VotingAlog obj = new VotingAlog();

        System.out.println(obj.majorityElement(nums));

    }
    
}
