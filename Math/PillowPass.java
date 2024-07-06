class PillowPass {
    public int passThePillow(int n, int time) {

    /*  int direction = 1;
        int index = 1;
        while(time > 0){
          if(direction == 1 && index < n){
            index += direction;
            time --;
          }
          else if(direction == -1 && index > 1){
            index += direction;
            time --;
          }
          else{
            direction = direction * (-direction);
            index += direction;
            time --;
          }
        } 

        return index;
        */

        // represents the number of complete rounds of pillow passing
        int fullrounds = time / (n -1) ;  

        // represents the remaining time after the complete rounds
        int extraround = time %( n-1);
        // If the number of complete rounds is even, the pillow is moving
        // forward. So, the person holding the pillow is at position
        // 'extraTime + 1' since we start from 1.
        // If the number of complete rounds is odd, the pillow is moving
        // backward. So, the person holding the pillow is at position
        // 'n - extraTime'

        return fullrounds % 2 == 0 ? extraround + 1: n - extraround;

    }

    public static void main(String args[]){

        PillowPass obj = new PillowPass();

        System.out.println(obj.passThePillow(18, 38));
    }
}