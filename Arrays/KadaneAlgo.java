//Kadabne's algorithm to find maxinum sum of subarray
public class KadaneAlgo{
    public int maxSum(int[] nums){
        int sum = nums[0];
        int max = sum;
        int i = 1 ;
        while(i< nums.length){
            if(sum <= 0){
                sum = 0;
            }
            sum = sum + nums[i];
            max = Math.max(max, sum);
            i++;
        }

        return max;
    }
    public static void main(String args[]){
        KadaneAlgo obj = new KadaneAlgo();
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println("Maximum sum of subarray in given array is:"+ obj.maxSum(arr));
    }
}