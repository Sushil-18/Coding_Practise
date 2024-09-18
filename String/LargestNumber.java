import java.util.Arrays;

public class LargestNumber {
     private String largestNumber(int[] arr){
        String[] strArr = new String[arr.length];

        for(int i = 0; i < arr.length ; i++){
            strArr[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(strArr, (a,b) -> (b+a).compareTo(a+b));  //lambda expression for custom comparator

        if(strArr[0].equals("0")){  //handling edge cases
            return "0";
        }

        StringBuilder str = new StringBuilder();  //taking new string

        for(String string :strArr){
            str.append(string);   //concatnating the numbers of string from array to string which needs to be returned
        }
            return str.toString();  //converting StrinBuilder to string using toString method.
     }
    public static void main(String args[]){
        LargestNumber obj = new LargestNumber();

        int[] arr = {3,30,34,5,9};

       String str =  obj.largestNumber(arr);

       System.out.println(str);
    }
}
