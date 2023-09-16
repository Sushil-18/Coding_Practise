
class Reverse {
    public int Rev(int n){
        int number = n;
        int num = 0;
        int num1 = 0;
        while (number != 0) {
            num1 = number % 10;
            num = num * 10 + num1;
            number = number / 10;
        }
        return num;
        }
    }
public class ReverseNumber {
    public static void main(String args[]){
        Reverse obj = new Reverse();
        int num = obj.Rev(341);
        System.out.println(num);
    }
}
