//Grumpy store owner : leetcode - 1052
public class GrumpyOwner{
   
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int allSatisfiedCust = 0 ;
        int i = 0; 
        int custSatisfiedAtMin = 0;

        //Calculating all the satisfied customer
        for(int j = 0; j < customers.length ; j++){
            allSatisfiedCust =allSatisfiedCust + customers[j] * (1-grumpy[j]); 
        }

        //Finding the max customers which are satisfied useing the technique, fixed slinding window of n minutes is used to here
        int max = custSatisfiedAtMin;
        for(int j = 0; j < customers.length ; j++){
            custSatisfiedAtMin +=  customers[j] * grumpy[j];
            max = Math.max(custSatisfiedAtMin,max);
            if(j >= minutes - 1){
                custSatisfiedAtMin -= customers[i] * grumpy[i];
                i += 1;
            }
            
        }
        allSatisfiedCust += max; // adding both results to get the required output

        return allSatisfiedCust;

    }


public static void main(String args[]){
    GrumpyOwner obj = new GrumpyOwner();

    int[] customers = {1,0,1,2,1,1,7,5};
    int[] grumpy = {0,1,0,1,0,1,0,1};
    int minutes = 3;

    System.out.println(obj.maxSatisfied(customers, grumpy, minutes));
}
}