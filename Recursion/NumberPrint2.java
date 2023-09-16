package Recursion;

class Recursion {
    public void printNumber(int i,int n) {
        int num = n;
        int index = i;
        if(index > num)
        return;
        System.out.print(index+ " ");
        index += 1;
        printNumber(index, num);
    }
}

public class NumberPrint2 {
    public static void main(String args[]) {
        Recursion obj = new Recursion();
        obj.printNumber(1,10);
    }

}
