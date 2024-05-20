public class SortedArray {
    public static boolean checkSorted(int[] arr, int len){
        int asc = 0;
        int desc = 0;
        for(int i = 0; i <= len-2; i++){
            if(arr[i] < arr[i+1]){
                asc += 1;
            }
            else{
                desc += 1;
            }
        }
    if(asc==0 || desc ==0){
        return true;
    }
    else{
        return false;
    }
    }

    public static void main(String args[]){
        int arr[] = {9,9,8,6,4,2,1};
        int length = arr.length;

        boolean check = checkSorted(arr, length);

        if(check == true){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
