class Monotonic {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 1; i < nums.length ; i++){
            if(nums[i-1] < nums[i]){
                decreasing = false;
            }
            else if(nums[i-1] > nums[i]){
                increasing = false;
            }
        }

        return increasing || decreasing;
    }

    public static void main(String args[]){
        Monotonic obj = new Monotonic();

        int[] arr = {1,2,2,3};

        boolean result = obj.isMonotonic(arr);

        if(result == true){
            System.out.println("The given array is monotonic");
        }
        else{
            System.out.println("The given array is not monotonic");
        }
    }
}
