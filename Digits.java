import java.util.*;
class Calcdigit {
    
    public int digits(int n) {
        int num = n;
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

}
public class Digits {
    public static void main(String args[]) {
        Calcdigit obj = new Calcdigit();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        sc.close();
        int digitsInNumber = obj.digits(number);
        System.out.println(digitsInNumber);
    }
}
