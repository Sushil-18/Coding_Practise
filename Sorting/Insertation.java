
public class Insertation {

    public static void print(int[] arr){
        for(int element : arr){
            System.out.println(element);
        }
    }

    public static void sort(int[] arr, int len){
        for(int i=0 ; i <= len - 1; i++){
            for(int j = i; j > 0 ; j--){
                if(arr[j-1] > arr[j]){
                arr[j-1] = arr[j-1] + arr[j];
                arr[j] = arr[j-1] - arr[j];
                arr[j-1] = arr[j-1] - arr[j];
                }
            }
        }
    }


    public static void main(String args[]){
        int[] arr = {65,22,63,98,34};
        int len = arr.length;
        System.out.println("Array before sorting");
        print(arr);
        sort(arr,len);
        System.out.println("Array after sorting");
        print(arr);
    }
}
