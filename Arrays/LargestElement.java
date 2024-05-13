class LargestElement{
    public static int maxElement(int arr[]){
        int max = 0;

        for(int element : arr){
            if(element > max){
                max = element ;
            }
        }

        return max;
    }
    public static void main(String args[]){
       // int arr[] = new int[10]; One of the way to declare an array
       int arr[] = {38,64,22,6,6,2,36,6,25};
       
       int maxElement = maxElement(arr);
       
       System.out.println("The maximum number in given array is " + maxElement);

    }
}