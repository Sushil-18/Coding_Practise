public class MaxProfit {

    public int maxProfit(int[] nums){
        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length ; i++){
            minValue = Math.min(nums[i],minValue);
            maxProfit = Math.max(maxProfit,nums[i] - minValue);
        }

        return maxProfit;
    }
    public static void main(String args[]){
        MaxProfit obj = new MaxProfit();

        int[] arr = {7,1,5,3,6,4};
        System.out.println("The maximum profit which can be earned is: "+ obj.maxProfit(arr));
    }
}
