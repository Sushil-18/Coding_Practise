public class RobotReturn {
    public boolean judgeCircle(String moves) {
        if(moves.length() % 2 != 0){
            return false;
        }
        int numberOfLeftMoves = 0;
        int numberOfRightMoves = 0;
        int numberOfUpMoves = 0;
        int numberOfDownMoves = 0;

        for(int i = 0; i < moves.length();i++){
            switch (moves.charAt(i)) {
                case 'R':{
                    numberOfRightMoves += 1;
                    break;
                }
                
                case 'L':{
                    numberOfLeftMoves += 1;
                    break;
                }

                case 'U':{
                    numberOfUpMoves += 1;
                    break;
                }

                case 'D':{
                    numberOfDownMoves += 1;
                    break;
                }
            }
        }
        return (numberOfDownMoves == numberOfUpMoves && numberOfLeftMoves == numberOfRightMoves);
    }

    public static void main(String args[]){
        RobotReturn obj = new RobotReturn();

        String str = "LRRL";

        System.out.println(obj.judgeCircle(str));
    }
}
