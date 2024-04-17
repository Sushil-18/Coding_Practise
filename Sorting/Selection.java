/**
 * Selection
 * Time complexity is O(N^2) as we are running nested for loop for sorting array elelements
 * Space complexity is O(1)
 */
public class Selection {
    public static void print(int arr[]){
        for(int element : arr){
            System.out.println(element);
        }
    }

    public static void sort(int arr[], int len){
        for(int i = 0; i < len-1; i++){
            for(int j = i+1 ; j < len ; j++){
                if(arr[i] > arr[j]){
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
    }

    public static void main(String args[]){
        int[] arr = {2,5,12,565,15};
        int len = arr.length;

        System.out.println("Array before sorting");
        print(arr);

        sort(arr,len);

        System.out.println("Array after sorting");
        print(arr);

    }
}