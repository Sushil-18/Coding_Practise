class CheckArmStrong {
    public int check(int n) {
        int num = n;
        double number = 0;
        int mod = 0;
        while (num != 0) {
            mod = num % 10;
            number = number + Math.pow(mod, 3);
            num = num / 10;
        }
        return (int)number;
    }
}
public class Armstrong {
    public static void main(String args[]) {
        CheckArmStrong obj = new CheckArmStrong();
        int num = 371;
        int armnum = obj.check(num);
        if (armnum == num ){
            System.out.println("The given number is Armstrong");
        }
        else{
            System.out.println("The given number is not an armstrong number");
        }
    }
}
