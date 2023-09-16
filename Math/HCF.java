import java.util.*;

class CheckHCF {
    public int check(int n1, int n2) {
        int num1 = n1;
        int num2 = n2;
        int min = (num1 > num2 ? num2 : num1);
        int HCF = 1;
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                HCF = i;
            }
        }
        return HCF;
    }
}
public class HCF {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        CheckHCF obj = new CheckHCF();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        int HCF = obj.check(num1, num2);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is " + HCF);
    }
}