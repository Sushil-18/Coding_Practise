

class Print {
    public int number(int n) {
        if (n <= 1) {
            return n;
        }
        int lastnum = number(n - 1);
        int slastnum = number(n - 2);

        return lastnum + slastnum;
    }
}
public class Fib {
    public static void main(String args[]) {
        Print obj = new Print();
        int num = obj.number(5);
        System.out.println(num);
    }
}
