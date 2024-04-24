import java.util.Scanner;

public class Bubble {
    public static void print (int[] arr, int len){
        for(int element : arr){
            System.out.println(element);
        }
    }

    public static void bubblesort(int[] arr,int len){
        for(int i = len -1;i >=0; i--){
            for(int j = 0 ; j < len-1 ; j++){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }
    }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter the array elements");
        for(int i = 0;  i < 6; i++){
            arr[i] = sc.nextInt();
        }

        int len = arr.length;
        System.out.println("Array before sorting");

        print(arr,len );
        bubblesort(arr,len);
        System.out.println("Array after sorting");
        print(arr, len);
     }
}