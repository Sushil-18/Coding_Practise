public class SecLargest1{
    public static int sort(int[] arr, int n){
        for(int i=0;i <= n-1 ; i++){
            for(int j= 0 ; j <= n-1; j++){
                if(arr[i] < arr[j]){
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        return arr[n-2];
    }
    public static void main(String args[]){
        //int arr[] = new int[5]; one of the way to define an array
        int arr[] = {7,765,23,6,52};
        int length = arr.length;

        //used selection sort to sort an array will update it with either merge or quick sort to reduce the complexity
        System.out.print("The second largest element in array is " + sort(arr,length));

    }
}