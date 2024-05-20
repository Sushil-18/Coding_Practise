//Remove duplicates from sorted array
public class RmDuplicate {

    public static int removeDuplicate(int[] arr){
        int i = 0 ;
        for(int j = 1; j < arr.length ; j++){
            if(arr[i] != arr[j]){
                i += 1;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String args[]){
       // int[] arr = new int[10]; One of the way to declare an array
       int[] arr = {1,2,2,4,4,5,6,7,7,9};
       int count = removeDuplicate(arr);

       System.out.println("The length of the array after removing duplicates is "+ count);

       for(int element : arr){
        System.out.print(element);
       }
    }
}
