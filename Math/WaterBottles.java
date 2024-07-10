public class WaterBottles {
     /* public int numWaterBottles(int numBottles, int numExchange) {
        int bottles = numBottles;
        int remainingBottles ;

        while(numBottles/numExchange >= 1){
            remainingBottles = numBottles % numExchange;
            numBottles = numBottles/numExchange ;
            bottles += numBottles;
            numBottles += remainingBottles;
        }

        return bottles;
    } */

    //Optimal - uses less memeory 
     public int numWaterBottles(int numBottles, int numExchange) {
        int bottles = numBottles;

        while(numBottles>=numExchange){
            bottles += numBottles / numExchange;
            numBottles = (numBottles/numExchange ) + (numBottles%numExchange);
        }

        return bottles;
    }

    public static void main(String args[]){
        WaterBottles obj = new WaterBottles();


        System.out.println(obj.numWaterBottles(15, 8));
    }
}
