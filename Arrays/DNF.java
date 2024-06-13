public class DNF {
    public void sortColors(int[] nums) {
        int low = 0; int mid = 0;
        int high = nums.length -1;

        while(mid<=high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                mid += 1;
                low += 1;
            }
            else if(nums[mid] == 1){
                mid += 1;
            }
            else{
            swap(nums, mid, high);
                high -= 1;
            }
        }
    }
    public void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]){
        DNF dnf = new DNF();
        int[] arr = {2};
        dnf.sortColors(arr);

        for(int i : arr){
            System.out.println(i);
        }
    }
}
