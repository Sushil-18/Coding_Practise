package Recursion;

class Print {
    public void printNumbers(int n) {
        int num = n;
        if (num < 0)
            return;
        System.out.print(num + " ");
        num -= 1;
        printNumbers(num);
    }
}
public class NumberPrint {
    public static void main(String args[]) {
        Print obj = new Print();
        obj.printNumbers(10);
    }
}